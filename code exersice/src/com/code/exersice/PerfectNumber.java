package com.code.exersice;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {

        if (number < 1) {

            return false;
        }

        int sum = 0;
        int i = 1;
        for (; i < number; i++) {

            if (number % i == 0) {

                sum += i;
            }
        }
        return sum == number && number > 1;
    }


    public static void main(String[] args) {

//		System.out.println(isPerfectNumber(6));
//		System.out.println(isPerfectNumber(28));
//		System.out.println(isPerfectNumber(5));
//		System.out.println(isPerfectNumber(-1));
        System.out.println(isPerfectNumber(1028));


    }

}
