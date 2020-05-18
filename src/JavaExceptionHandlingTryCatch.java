// https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandlingTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(x / y);
        } catch (InputMismatchException exception) {
            System.out.println(exception.getClass().getName());
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}
