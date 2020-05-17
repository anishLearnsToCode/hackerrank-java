//

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }

    private static class Student {
        int id;
        String name;
        double cgpa;

        Student(int id, String name, double cgpa) {
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }

        String getName() {
            return name;
        }

        int getId() {
            return id;
        }

        double getCgpa() {
            return cgpa;
        }
    }

    private static class Priorities {
        List<Student> getStudents(List<String> events) {
            PriorityQueue<Student> queue = new PriorityQueue<>(
                    Comparator.comparing(Student::getCgpa).reversed()
                            .thenComparing(Student::getName)
                            .thenComparing(Student::getId)
            );

            for (String event : events) {
                String[] tokens = event.split(" ");
                if (tokens[0].equals("ENTER")) {
                    String name = tokens[1];
                    double cgpa = Double.parseDouble(tokens[2]);
                    int id = Integer.parseInt(tokens[3]);
                    queue.add(new Student(id, name, cgpa));
                } else {
                    queue.poll();
                }
            }

            while(queue.size() > 1) {
                System.out.println(queue.poll().name);
            }

            return new ArrayList<>(queue);
        }
    }
}
