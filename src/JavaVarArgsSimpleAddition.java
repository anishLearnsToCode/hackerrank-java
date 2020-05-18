// https://www.hackerrank.com/challenges/simple-addition-varargs

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class JavaVarArgsSimpleAddition {
    private static class Add {
        public void add(int... numbers) {
            int sum = numbers[0];
            System.out.print(numbers[0]);
            for (int index = 1 ; index < numbers.length ; index++) {
                System.out.print("+" + numbers[index]);
                sum += numbers[index];
            }
            System.out.println("=" + sum);
        }
    }
}
