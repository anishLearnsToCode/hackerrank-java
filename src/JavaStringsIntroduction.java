// https://www.hackerrank.com/challenges/java-strings-introduction/problem

import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        System.out.println(a.length() + b.length());
        System.out.println(a.compareTo(b) > 0 ? "Yes" : "No");
        System.out.println(capitalize(a) + " " + capitalize(b));
    }

    private static String capitalize(String string) {
     return string.substring(0, 1).toUpperCase() + string.substring(1);
    }
}
