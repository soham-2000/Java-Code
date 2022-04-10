package com.code.exersice;

public class IntEqualityPrinter {

    public static void printEqual(int a, int b, int c) {

        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
        } else if (a == b && b == c && c == a) {
            System.out.println("All numbers are equal");
        } else if (a == b || b == c || c == a) {
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("All numbers are different");
        }

    }

    public static void main(String[] args) {

        printEqual(43, 23, 33);
        printEqual(33, 33, 33);
        printEqual(33, 23, 33);


    }

}
