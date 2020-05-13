// hackerrank.com/challenges/java-static-initializer-block/problem

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    private static final int B;
    private static final int H;
    private static boolean flag = true;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        if (B <= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}
