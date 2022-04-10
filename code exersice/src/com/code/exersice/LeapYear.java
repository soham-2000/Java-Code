package com.code.exersice;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else return year % 100 == 0 && year % 400 == 0;
    }

    public static void main(String[] args) {

        boolean year = isLeapYear(1990);
        System.out.println(year);

    }

}
