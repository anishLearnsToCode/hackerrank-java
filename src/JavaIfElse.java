import java.util.Scanner;

public class JavaIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        if (number % 2 == 1) {
            System.out.println("Weird");
        } else if (2 <= number && number <= 5) {
            System.out.println("Not Weird");
        } else if (6 <= number && number <= 20) {
            System.out.println("Weird");
        } else if (20 <= number) {
            System.out.println("Not Weird");
        }
    }
}
