import java.util.Scanner;

public class JavaStdInAndStdOutII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int integer = scanner.nextInt();
        double d = scanner.nextDouble();
        scanner.nextLine();
        String string = scanner.nextLine();

        System.out.println("String: " + string);
        System.out.println("Double: " + d);
        System.out.println("Int: " + integer);
    }
}
