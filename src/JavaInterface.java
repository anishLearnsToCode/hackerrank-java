// https://www.hackerrank.com/challenges/java-interface/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

import java.util.Scanner;

public class JavaInterface {
    public static void main(String[] args) {
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        scanner.close();
    }

    private static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}

interface AdvancedArithmetic {
    int divisor_sum(int number);
}

class MyCalculator implements AdvancedArithmetic {
    @Override
    public int divisor_sum(int number) {
        int result = 1 + (number > 1 ? number : 0);
        for (int index = 2 ; index < number ; index++) {
            result += number % index == 0 ? index : 0 ;
        }
        return result;
    }
}