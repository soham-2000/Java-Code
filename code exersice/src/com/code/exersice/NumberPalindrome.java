package com.code.exersice;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

//		if(number<0) {
//			
//			number *= -1;
//		}
//		
        int reverse = 0;
        int lastDigit;
        int num = number;
        while (num != 0) {
            lastDigit = 0;
            lastDigit = num % 10;
            reverse *= 10;
            reverse += lastDigit;
            num /= 10;
        }
        return reverse == number;
    }


    public static void main(String[] args) {

        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

    }

}
