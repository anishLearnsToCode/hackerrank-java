// https://www.hackerrank.com/challenges/java-anagrams/problem

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaAnagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        if (isAnagram(a, b)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }

    private static boolean isAnagram(String a, String b) {
        int[] aCharacterFrequencies = getCharacterFrequencies(a);
        int[] bCharacterFrequencies = getCharacterFrequencies(b);
        return areEqual(aCharacterFrequencies, bCharacterFrequencies);
    }

    private static int[] getCharacterFrequencies(String string) {
        int[] result = new int[26];
        string = string.toLowerCase();
        for (int index = 0 ; index < string.length() ; index++) {
            result[string.charAt(index) - 97]++;
        }
        return result;
    }

    private static boolean areEqual(int[] a, int[] b) {
        for (int index = 0 ; index < a.length ; index++) {
            if (a[index] != b[index]) {
                return false;
            }
        }
        return true;
    }

    private static boolean areAnagrams(String a, String b) {
        Map<Character, Integer> aCharacterFrequencies = getFrequencies(a);
        Map<Character, Integer> bCharacterFrequencies = getFrequencies(b);
        return aCharacterFrequencies.equals(bCharacterFrequencies);
    }

    private static Map<Character, Integer> getFrequencies(String string) {
        Map<Character, Integer> frequencies = new HashMap<>();
        string = string.toLowerCase();
        for (int index = 0 ; index < string.length() ; index++) {
            char character = string.charAt(index);
            frequencies.put(character, frequencies.getOrDefault(character, 0) + 1);
        }
        return frequencies;
    }
}
