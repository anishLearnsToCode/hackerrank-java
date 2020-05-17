// https://www.hackerrank.com/challenges/java-stack/problem

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.next();
            System.out.println(isBalanced(input));
        }
    }

    private static boolean isBalanced(String string) {
        Stack<Character> brackets = new Stack<>();
        for (int index = 0 ; index < string.length() ; index++) {
            char character = string.charAt(index);
            if (isOpeningBrace(character)) {
                brackets.push(character);
            } else if (isClosingBrace(character)) {
                if (brackets.isEmpty() || brackets.peek() != inverse(character)) {
                    return false;
                } else {
                    brackets.pop();
                }
            }
        }

        return brackets.isEmpty();
    }

    private static boolean isOpeningBrace(char character) {
        return character == '[' || character == '{' || character == '(' ;
    }

    private static boolean isClosingBrace(char character) {
        return character == ']' || character == '}' || character == ')' ;
    }

    private static char inverse(char bracket) {
        switch (bracket) {
            case ')' : return '(';
            case ']' : return '[';
            case '}' : return '{';
        }
        return '-';
    }
}
