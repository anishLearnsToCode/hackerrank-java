// https://www.hackerrank.com/challenges/sha-256/problem

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaSHA_256 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest sha256 = MessageDigest.getInstance("sha-256");
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        scanner.close();

        byte[] hash = sha256.digest(message.getBytes());
        String hashHexCode = toHex(hash);
        System.out.println(hashHexCode);
    }

    private static String toHex(byte[] array) {
        StringBuilder sb = new StringBuilder(2 * array.length);
        for(byte b : array) {
            sb.append(String.format("%02x", b&0xff));
        }
        return sb.toString();
    }
}
