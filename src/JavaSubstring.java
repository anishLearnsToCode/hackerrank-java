// https://www.hackerrank.com/challenges/java-substring/problem

import java.util.Scanner;

public class JavaSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        scanner.close();

        System.out.println(string.substring(start, end));
    }
}
