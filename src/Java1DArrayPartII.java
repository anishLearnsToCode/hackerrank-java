// https://www.hackerrank.com/challenges/java-1d-array/problem

import java.util.Scanner;

public class Java1DArrayPartII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }

    private static boolean canWin(int leap, int[] game) {
        return canWin(leap, game, 0);
    }

    private static boolean canWin(int leap, int[] array, int index) {
        if (index < 0 || array[index] == 1) {
            return false;
        }

        if (index == array.length - 1 || index + leap > array.length - 1) {
            return true;
        }

        array[index] = 1;

        return canWin(leap, array, index + 1)
                || canWin(leap, array, index - 1)
                || canWin(leap, array, index + leap);
    }
}
