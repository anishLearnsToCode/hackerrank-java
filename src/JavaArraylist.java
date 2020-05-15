// https://www.hackerrank.com/challenges/java-arraylist/problem

import helper.InputHelper;

public class JavaArraylist {
    public static void main(String[] args) {
        int length = InputHelper.takeLength();
        int[][] matrix = new int[length][];

        for (int row = 0 ; row < length ; row++) {
            int columns = InputHelper.takeLength();
            matrix[row] = new int[columns];
            matrix[row] = InputHelper.get1DArray(columns);
        }

        int queries = InputHelper.takeLength();
        while (queries-- > 0) {
            int row = InputHelper.takeLength();
            int column = InputHelper.takeLength();

            System.out.println(
                    row - 1 < length && column - 1 < matrix[row - 1].length
                    ? matrix[row - 1][column - 1]
                    : "ERROR!"
            );
        }
    }
}
