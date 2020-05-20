// https://www.hackerrank.com/challenges/java-lambda-expressions/problem

public class JavaLambdaExpression {
    private interface PerformOperation {
        boolean check(int number);
    }

    private static class MyMath {
        public static PerformOperation isOdd() {
            return (int a) -> a % 2 != 0;
        }

        public static PerformOperation isPrime() {
            return (int number) -> {
                if(number == 1) return false;

                for (int index = 2 ; index * index <= number ; index++) {
                    if (number % index == 0) {
                        return false;
                    }
                }
                return true;
            };
        }

        public static PerformOperation isPalindrome() {
            return (int a) -> {
                String number = a + "";
                String reverse = new StringBuilder(number).reverse().toString();
                return number.equals(reverse);
            };
        }
    }
}
