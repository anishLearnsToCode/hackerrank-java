// https://www.hackerrank.com/challenges/java-negative-subarray/problem

import helper.InputHelper;

public class JavaSubArray {
    public static void main(String[] args) {
        int[] array = InputHelper.get1DArray(InputHelper.takeLength());
        System.out.println(negativeSumSubArrays(array));
    }

    private static int negativeSumSubArrays(int[] array) {
        int count = 0;
        for (int i = 0 ; i < array.length ; i++) {
            for (int j = i, sum = 0 ; j < array.length ; j++) {
                sum += array[j];
                count += sum < 0 ? 1 : 0 ;
            }
        }
        return count;
    }
}
