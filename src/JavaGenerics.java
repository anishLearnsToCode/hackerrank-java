// https://www.hackerrank.com/challenges/java-generics/problem

public class JavaGenerics {
    public static void main(String[] args) {

    }

    private static class Printer {
        public <T> void printArray(T[] array) {
            for (T element : array) {
                System.out.println(element);
            }
        }
    }
}
