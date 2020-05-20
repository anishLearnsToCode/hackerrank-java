// https://www.hackerrank.com/challenges/java-md5/problem

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class MD5 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        scanner.close();

        byte[] hash = md5.digest(message.getBytes());
        String hexadecimalHash = toHex(hash);
        System.out.println(hexadecimalHash);
    }

    private static String toHex(byte[] array) {
        StringBuilder sb = new StringBuilder(2 * array.length);
        for(byte b : array) {
            sb.append(String.format("%02x", b&0xff));
        }
        return sb.toString();
    }
}
