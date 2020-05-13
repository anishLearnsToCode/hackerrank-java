// https://www.hackerrank.com/challenges/pattern-syntax-checker/problem

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int queries = scanner.nextInt();
        scanner.nextLine();

        while (queries-- > 0) {
            String regex = scanner.nextLine();
            if (isValidPattern(regex)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }

    private static boolean isValidPattern(String regex) {
        try {
            Pattern.compile(regex);
            return true;
        } catch (PatternSyntaxException exception) {
            return false;
        }

    }
}
