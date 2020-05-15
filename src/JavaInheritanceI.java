// https://www.hackerrank.com/challenges/java-inheritance-1/problem

public class JavaInheritanceI {
    public static void main(String[] args) {

    }

    private static class Animal {
        public void walk() {
            System.out.println("I am walking");
        }
    }

    private static class Bird extends Animal {
        public void fly() {
            System.out.println("I am flying");
        }

        public void sing() {
            System.out.println("I am singing");
        }
    }
}
