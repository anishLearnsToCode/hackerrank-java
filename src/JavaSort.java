// https://www.hackerrank.com/challenges/java-sort

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class JavaSort {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<>();
        while(testCases-- > 0){
            int id = in.nextInt();
            String name = in.next();
            double cgpa = in.nextDouble();
            studentList.add(new Student(id, name, cgpa));
        }

        studentList.sort(
                Comparator.comparing(Student::getCgpa).reversed()
                        .thenComparing(Student::getName)
                        .thenComparing(Student::getId)
        );

        for(Student student: studentList){
            System.out.println(student.getName());
        }
    }

    private static class Student{
        private int id;
        private String name;
        private double cgpa;

        public Student(int id, String name, double cgpa) {
            super();
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getCgpa() {
            return cgpa;
        }
    }
}
