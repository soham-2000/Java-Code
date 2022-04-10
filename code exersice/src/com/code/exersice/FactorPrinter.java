package com.code.exersice;

public class FactorPrinter {

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + "\n");

            }
        }
    }


    public static void main(String[] args) {

        printFactors(10);
        System.out.println("\n");
        printFactors(32);
        System.out.println("\n");
        printFactors(6);
        System.out.println("\n");
        printFactors(-1);

    }

}
