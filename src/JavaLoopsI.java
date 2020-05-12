import java.util.Scanner;

public class JavaLoopsI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        for (int index = 1 ; index <= 10 ; index++) {
            System.out.println(number + " x " + index + " = " + number * index);
        }
    }
}
