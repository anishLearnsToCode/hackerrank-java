// https://www.hackerrank.com/challenges/java-date-and-time/problem

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class JavaDateAndTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day  = scanner.nextInt();
        int year = scanner.nextInt();
        scanner.close();
        System.out.println(findDay(month, day, year));
    }

    static String findDay(int month, int day, int year) {
        Date date = new GregorianCalendar(year, month - 1, day).getTime();
        return getDayName(date.getDay());
    }

    private static Date createDate(int month, int day, int year) {
        return new Date(year, month, day);
    }

    private static String getDayName(int dayOfWeek) {
        switch (dayOfWeek) {
            case 0 : return "SUNDAY";
            case 1 : return "MONDAY";
            case 2 : return "TUESDAY";
            case 3 : return "WEDNESDAY";
            case 4 : return "THURSDAY";
            case 5 : return "FRIDAY";
            case 6 : return "SATURDAY";
        }
        return "";
    }
}
