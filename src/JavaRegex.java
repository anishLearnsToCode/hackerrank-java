// https://www.hackerrank.com/challenges/java-regex/problem

import java.util.Scanner;

public class JavaRegex {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String IP = scanner.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        scanner.close();
    }
}

class MyRegex {
    final String pattern = "([0-1]?\\d{1,2}[.]|2([0-4]\\d|5[0-5])[.]){3}([0-1]?\\d{1,2}|2([0-4]\\d|5[0-5]))";
}
