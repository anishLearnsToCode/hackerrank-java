// https://www.hackerrank.com/challenges/java-string-reverse/problem

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        scanner.close();

        if (string.equals(reverse(string))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static String reverse(String string) {
        StringBuffer accumulator = new StringBuffer(string);
        accumulator.reverse();
        return accumulator.toString();
    }
}
