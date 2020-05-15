// https://www.hackerrank.com/challenges/tag-content-extractor/problem

import java.util.Scanner;

public class TagContentExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int queries = scanner.nextInt();
        scanner.nextLine();

        while (queries-- > 0) {
            String string = scanner.nextLine();
            printValidTokens(string);
        }
    }

    private static void printValidTokens(String string) {
        String token = null;
        boolean flag = true;

        for (int index = 0, startIndex = -1 ; index < string.length() ; index++) {
            if (string.charAt(index) == '<') {
                Lexene lexene = new Lexene(string, index);
                if (lexene.isOpeningTag) {
                    index += lexene.token.length() + 1;
                    token = lexene.token;
                    startIndex = index + 1;
                } else {
                    if (lexene.token.equals(token) && index - startIndex > 0 && !lexene.token.equals("")) {
                        System.out.println(string.substring(startIndex, index));
                        flag = false;
                    }
                    token = null;
                }
            }
        }

        if (flag) {
            System.out.println("None");
        }
    }

    private static class Lexene {
        String token;
        boolean isOpeningTag;

        Lexene(String string, int startIndex) {
            StringBuilder accumulator = new StringBuilder();
            for (int index = startIndex + 1 ; index < string.length() ; index++) {
                if (string.charAt(index) == '>') {
                    break;
                }
                accumulator.append(string.charAt(index));
            }

            token = accumulator.length() > 0
                    ? accumulator.charAt(0) == '/' ? accumulator.substring(1) : accumulator.toString()
                    : "";
            isOpeningTag = accumulator.length() > 0 && accumulator.charAt(0) != '/';
        }
    }
}
