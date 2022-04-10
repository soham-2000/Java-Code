package com.code.exersice;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        int sum = 0;
        int lastDigit;


        if (number < 0) {

            return -1;
        }

        lastDigit = number % 10;
        while (number >= 10) {

            number = number / 10;
        }
        int firstDigit = number;
        sum = number + lastDigit;

        return sum;


    }


    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));


    }

}
