// https://www.hackerrank.com/challenges/java-primality-test/problem

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BigInteger number = new BigInteger(scanner.next());
        System.out.println(number.isProbablePrime(10) ? "prime" : "not prime");
    }
}
