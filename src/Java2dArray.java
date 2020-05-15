// https://www.hackerrank.com/challenges/java-2d-array/problem

import java.util.Scanner;

public class Java2dArray {
    public static void main(String[] args) {
        int[][] matrix = getInput();
        System.out.println(maxHourGlassSum(matrix));
    }

    private static int maxHourGlassSum(int[][] matrix) {
        int sum = Integer.MIN_VALUE;
        for (int row = 0 ; row < 4 ; row++) {
            for (int column = 0 ; column < 4 ; column++) {
                sum = Math.max(sum, hourGlassSum(row, column, matrix));
            }
        }
        return sum;
    }

    private static int hourGlassSum(int row, int column, int[][] matrix) {
        int sum = 0;
        for (int index = 0 ; index < 3 ; sum += matrix[row][column + index++]);
        for (int index = 0 ; index < 3 ; sum += matrix[row + 2][column + index++]);
        return sum + matrix[row + 1][column + 1];
    }

    private static int[][] getInput() {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[6][6];
        for (int row = 0 ; row < 6 ; row++) {
            for (int column = 0 ; column < 6 ; column++) {
                matrix[row][column] = scanner.nextInt();
            }
        }
        scanner.close();
        return matrix;
    }
}
