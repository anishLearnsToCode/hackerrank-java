// https://www.hackerrank.com/challenges/valid-username-checker/problem

import java.util.Scanner;

public class ValidUsernameRegularExpression {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scanner.nextLine());
        while (n-- != 0) {
            String userName = scanner.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }

    private static class UsernameValidator {
        public static final String regularExpression = "([A-Z]|[a-z])\\w{7,29}";
    }
}
