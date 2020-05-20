// https://www.hackerrank.com/challenges/java-covariance/problem

public class CovariantReturnTypes {
    public static void main(String[] args) {

    }

    private static class Flower {
        String whatsYourName() {
            return "I have many names and return types.";
        }
    }

    private static class Jasmine extends Flower {
        @Override
        String whatsYourName() {
            return "Jasmine";
        }
    }

    private static class Lotus extends Flower {
        @Override
        String whatsYourName() {
            return "lotus";
        }
    }

    private static class Lily extends Flower {
        @Override
        String whatsYourName() {
            return "Lily";
        }
    }

    private static class Region {
        Flower yourNationalFlower() {
            return new Flower();
        }
    }

    private static class WestBengal extends Region {
        private static final Flower NATIONAL_FLOWER = new Jasmine();

        @Override
        Flower yourNationalFlower() {
            return NATIONAL_FLOWER;
        }
    }

    private static class AndhraPradesh extends Region {
        private static final Flower NATIONAL_FLOWER = new Lily();

        @Override
        Flower yourNationalFlower() {
            return NATIONAL_FLOWER;
        }
    }
}
