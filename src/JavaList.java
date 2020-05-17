// https://www.hackerrank.com/challenges/java-list/problem

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int length = SCANNER.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int index = 0 ; index < length ; index++) {
            list.add(SCANNER.nextInt());
        }

        int queries = SCANNER.nextInt();
        runQueries(queries, list);
        print(list);
    }

    private static void print(List<Integer> list) {
        for (int element : list) {
            System.out.print(element + " ");
        }
    }

    private static void runQueries(int queries, List<Integer> list) {
        while (queries-- > 0) {
            String action = SCANNER.next();
            if (action.equals("Insert")) {
                int index = SCANNER.nextInt();
                int value = SCANNER.nextInt();
                list.add(index, value);
            } else { // "Delete"
                int index = SCANNER.nextInt();
                list.remove(index);
            }
        }
    }
}
