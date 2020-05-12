import java.util.Scanner;

public class JavaDatatypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int queries = scanner.nextInt();

        while (queries-- > 0) {
            String number = scanner.next();
            if (canBeParsedAsNumber(number)) {
                printValidStorageTypes(number);
            } else {
                System.out.println(number + " can't be fitted anywhere.");
            }
        }
    }

    private static boolean canBeParsedAsNumber(String string) {
        return canBeStoredAsLong(string);
    }

    private static void printValidStorageTypes(String number) {
        System.out.println(number + " can be fitted in:");

        if (canBeStoredAsByte(number)) {
            System.out.println("* byte");
        }

        if (canBeStoredAsShort(number)) {
            System.out.println("* short");
        }

        if (canBeStoredAsInt(number)) {
            System.out.println("* int");
        }

        System.out.println("* long");
    }

    private static boolean canBeStoredAsByte(String number) {
        try {
            Byte.parseByte(number);
            return true;
        } catch (NumberFormatException exception) {
            return false;
        }
    }

    private static boolean canBeStoredAsShort(String number) {
        try {
            Short.parseShort(number);
            return true;
        } catch (NumberFormatException exception) {
            return false;
        }
    }

    private static boolean canBeStoredAsInt(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException exception) {
            return false;
        }
    }

    private static boolean canBeStoredAsLong(String number) {
        try {
            Long.parseLong(number);
            return true;
        } catch (NumberFormatException exception) {
            return false;
        }
    }
}
