package hust.soict.hedspi.lab01;
import java.util.Scanner;

public class NumberOfDay {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        System.out.println("Enter a month: ");
        String month = input.nextLine();
        System.out.println("Enter a year: ");
        String year = input.nextLine();
        System.out.println("Number of days: " + getNumberOfDays(formatMonth(month), Integer.parseInt(year)));
    }

    private static int getNumberOfDays(String month, int year) {
        if (month == "1" || month == "3" || month == "5" || month == "7" || month == "8" || month == "10"
                || month == "12") {
            return 31;
        } else if (month == "4" || month == "6" || month == "9" || month == "11") {
            return 30;
        } else if (month == "2") {
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        } else {
            return 0;
        }
    }

    private static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    private static String formatMonth(String month) {
        String monthNumber = null;
        if (month == "January" || month == "Jan." || month == "Jan" || month == "1") {
            monthNumber = "1";
        } else if (month == "February" || month == "Feb." || month == "Feb" || month == "2") {
            monthNumber = "2";
        } else if (month == "March" || month == "Mar." || month == "Mar" || month == "3") {
            monthNumber = "3";
        } else if (month == "April" || month == "Apr." || month == "Apr" || month == "4") {
            monthNumber = "4";
        } else if (month == "May" || month == "May." || month == "5") {
            monthNumber = "5";
        } else if (month == "June" || month == "Jun" || month == "6") {
            monthNumber = "6";
        } else if (month == "July" || month == "Jul" || month == "7") {
            monthNumber = "7";
        } else if (month == "August" || month == "Aug." || month == "Aug" || month == "8") {
            monthNumber = "8";
        } else if (month == "September" || month == "Sep." || month == "Sep" || month == "9") {
            monthNumber = "9";
        } else if (month == "October" || month == "Oct." || month == "Oct" || month == "10") {
            monthNumber = "10";
        } else if (month == "November" || month == "Nov." || month == "Nov" || month == "11") {
            monthNumber = "11";
        } else if (month == "December" || month == "Dec." || month == "Dec" || month == "12") {
            monthNumber = "12";
        } else {
            monthNumber = "0";
        }
        return monthNumber;
    }
}