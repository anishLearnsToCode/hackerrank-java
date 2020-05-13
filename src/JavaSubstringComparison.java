// https://www.hackerrank.com/challenges/java-string-compare/problem

import java.util.Scanner;

public class JavaSubstringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int k = scanner.nextInt();
        scanner.close();

        System.out.println(getSmallestAndLargest(string, k));
    }

    private static String getSmallestAndLargest(String string, int k) {
        String largest;
        String smallest = largest = string.substring(0, k);

        for (int index = 1 ; index < string.length() - k + 1 ; index++) {
            String subString = string.substring(index, index + k);
            smallest = smallest.compareTo(subString) < 0 ? smallest : subString;
            largest = largest.compareTo(subString) < 0 ? subString : largest;
        }

        return smallest + "\n" + largest;
    }
}
