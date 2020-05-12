import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int queries = scanner.nextInt();

        while (queries-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            for (int index = 1, sum = a + b ; index <= n ; index++) {
                System.out.print(sum + " ");
                sum += (int) Math.pow(2, index) * b;
            }
            System.out.println();
        }
    }
}
