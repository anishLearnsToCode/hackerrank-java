// https://www.hackerrank.com/challenges/java-exception-handling/problem

import java.util.Scanner;

public class JavaExceptionHandling {
    public static final MyCalculator MY_CALCULATOR = new MyCalculator();
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        while (SCANNER.hasNextInt()) {
            int n = SCANNER.nextInt();
            int p = SCANNER.nextInt();

            try {
                System.out.println(MY_CALCULATOR.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    private static class MyCalculator {
        public long power(int base, int power) throws Exception {
            if (base == 0 && power == 0) {
                throw new Exception("n and p should not be zero.");
            } else if (base < 0 || power < 0) {
                throw new Exception("n and p should not be negative.");
            }

            long result = 1;
            for (int i = 0 ; i < power ; i++) {
                result *= base;
            }
            return result;
        }
    }
}
