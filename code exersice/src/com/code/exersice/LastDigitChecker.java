package com.code.exersice;

public class LastDigitChecker {


    public static boolean isValid(int number) {

        return ((number > 9) && (number < 1001));

    }

    public static boolean hasSameLastDigit(int a, int b, int c) {


        if (isValid(a) && isValid(b) && isValid(c)) {

            a %= 10;
            b %= 10;
            c %= 10;

            return (a == b) || (a == c) || (b == c);
        }

        return false;
    }


    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
        // TODO Auto-generated method stub

    }

}
