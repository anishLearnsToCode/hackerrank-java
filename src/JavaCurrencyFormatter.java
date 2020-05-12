// https://www.hackerrank.com/challenges/java-currency-formatter/problem

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextDouble();
        scanner.close();

        System.out.println("US: " + toAmericanFormat(value));
        System.out.println("India: " + toIndianFormat(value));
        System.out.println("China: " + toChineseFormat(value));
        System.out.println("France: " + toFrenchFormat(value));
    }

    private static String toFrenchFormat(double value) {
        return NumberFormat.getCurrencyInstance(Locale.FRANCE).format(value);
    }

    private static String toAmericanFormat(double value) {
        return NumberFormat.getCurrencyInstance(Locale.US).format(value);
    }

    private static String toIndianFormat(double value) {
        return "Rs." + NumberFormat.getCurrencyInstance(Locale.US).format(value).substring(1);
    }

    private static String toChineseFormat(double value) {
        return NumberFormat.getCurrencyInstance(Locale.CHINA).format(value);
    }
}
