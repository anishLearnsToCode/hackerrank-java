// https://www.hackerrank.com/challenges/phone-book/problem

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Map<String, Long> directory = getDirectory();

        while (SCANNER.hasNext()) {
            String name = SCANNER.next();
            System.out.println(directory.containsKey(name) ? name + "=" + directory.get(name) : "Not found");
        }
    }

    private static Map<String, Long> getDirectory() {
        Map<String, Long> directory = new HashMap<>();
        int queries = SCANNER.nextInt();

        while (queries-- > 0) {
            String name = SCANNER.next();
            long number = SCANNER.nextLong();
            directory.put(name, number);
        }

        return directory;
    }
}
