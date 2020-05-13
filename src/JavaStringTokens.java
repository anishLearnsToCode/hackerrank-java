// https://www.hackerrank.com/challenges/java-string-tokens/problem

import java.util.Arrays;
import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String string = scanner.nextLine().trim();

        String[] tokens = string.split("[ ,?.!'_@]+");
        System.out.println(string.length() == 0 ? "0" : tokens.length);
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
