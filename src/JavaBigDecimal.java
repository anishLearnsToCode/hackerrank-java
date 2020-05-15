// https://www.hackerrank.com/challenges/java-bigdecimal/problem

import helper.TerminalPrinter;

import java.math.BigDecimal;
import java.util.*;

public class JavaBigDecimal {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        String[] strings = input(n);

        Arrays.sort(strings, 0, n, Collections.reverseOrder((o1, o2) -> {
            BigDecimal first = new BigDecimal(o1);
            BigDecimal second = new BigDecimal(o2);
            return first.compareTo(second);
        }));

        TerminalPrinter.print(strings, 0, n);
    }

    private static String[] input(int number) {
        String[] strings = new String[number + 2];
        for(int i = 0 ; i < number ; i++){
            strings[i] = scanner.next();
        }
        return strings;
    }
}
