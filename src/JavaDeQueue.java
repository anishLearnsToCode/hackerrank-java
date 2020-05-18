// https://www.hackerrank.com/challenges/java-dequeue

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaDeQueue {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        int length = SCANNER.nextInt();
        int subArraySize = SCANNER.nextInt();
        int[] array = getArray(length);
        Map<Integer, Integer> frequencies = getElementsOfFirstSubArray(array, subArraySize);
        int maxUniqueElements = frequencies.size();

        for (int index = 0 ; index < array.length - subArraySize ; index++) {
            remove(frequencies, array[index]);
            frequencies.put(array[index + subArraySize],
                    frequencies.getOrDefault(array[index + subArraySize], 0) + 1);
            maxUniqueElements = Math.max(maxUniqueElements, frequencies.size());
        }

        System.out.println(maxUniqueElements);
    }

    private static void remove(Map<Integer, Integer> frequencies, int element) {
        if (frequencies.containsKey(element)) {
            if (frequencies.get(element) <= 1) {
                frequencies.remove(element);
            } else {
                frequencies.put(element, frequencies.get(element) - 1);
            }
        }
    }

    private static int[] getArray(int length) {
        int[] array = new int[length];
        for (int index = 0 ; index < array.length ; index++) {
            array[index] = SCANNER.nextInt();
        }
        return array;
    }

    private static Map<Integer, Integer> getElementsOfFirstSubArray(int[] array, int subArraySize) {
        Map<Integer, Integer> frequencies = new HashMap<>();
        for (int index = 0 ; index < subArraySize ; index++) {
            frequencies.put(array[index], frequencies.getOrDefault(array[index], 0) + 1);
        }
        return frequencies;
    }
}
