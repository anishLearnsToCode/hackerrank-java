import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("================================");

        for(int index = 0 ;index < 3; index++){
            String string = scanner.next();
            int integer = scanner.nextInt();
            System.out.println(formattedString(string) + formattedInteger(integer));
        }

        scanner.close();
        System.out.println("================================");
    }

    private static String formattedString(String string) {
        return (string.trim() + "               ").substring(0, 15);
    }

    private static String formattedInteger(int number) {
        return number < 10 ? "00" + number : (number < 100 ? "0" + number : String.valueOf(number));
    }
}
