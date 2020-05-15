// https://www.hackerrank.com/challenges/java-biginteger/problem

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = new BigInteger(scanner.next());
        BigInteger b = new BigInteger(scanner.next());

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
