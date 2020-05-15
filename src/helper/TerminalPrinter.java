package helper;

public class TerminalPrinter {
    public static void print(String[] strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static void print(String[] strings, int fromIndex, int endIndex) {
        for (int index = fromIndex ; index < endIndex ; index++) {
            System.out.println(strings[index]);
        }
    }
}
