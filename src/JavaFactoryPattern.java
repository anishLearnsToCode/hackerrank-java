// https://www.hackerrank.com/challenges/java-factory/problem

import java.security.Permission;
import java.util.Scanner;

public class JavaFactoryPattern {
    public static void main(String args[]){
        Do_Not_Terminate.forbidExit();
        try{
            Scanner sc = new Scanner(System.in);
            //creating the factory
            FoodFactory foodFactory = new FoodFactory();

            //factory instantiates an object
            Food food = foodFactory.getFood(sc.nextLine());

            System.out.println("The factory returned "+food.getClass());
            System.out.println(food.getType());
        } catch (Do_Not_Terminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }

    private interface Food {
        String getType();
    }

    private static class Pizza implements Food {
        public String getType() {
            return "Someone ordered a Fast Food!";
        }
    }

    private static class Cake implements Food {
        public String getType() {
            return "Someone ordered a Dessert!";
        }
    }

    private static class FoodFactory {
        public Food getFood(String order) {
            switch (order) {
                case "cake" : return new Cake();
                case "pizza" : return new Pizza();
            }
            return null;
        }
    }
}

class Do_Not_Terminate {

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1L;
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}
