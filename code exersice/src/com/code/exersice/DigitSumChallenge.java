package com.code.exersice;

public class DigitSumChallenge {

    public static int sumDigit(int number) {

        if (number < 10) {

            return -1;

        }

        int sum = 0;

        while (number > 0) {
            int remainder = number % 10;
            sum += remainder;
            number = number / 10;

        }

//		for(sum = 0; number!=0;number=number/10) {
//			
//			sum = sum + number % 10;
//		}
        return sum;
    }


    public static void main(String[] args) {

        System.out.println(sumDigit(1));
        System.out.println(sumDigit(-4));
        System.out.println(sumDigit(125));
        System.out.println(sumDigit(6585355));
        System.out.println(sumDigit(-55));
        System.out.println(sumDigit(0));
        System.out.println(sumDigit(11));
        System.out.println(sumDigit(44));


    }

}
