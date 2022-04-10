package com.code.exersice;

import java.util.Scanner;

public class NthPrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth number you seek: ");
        int n = sc.nextInt();
        int count = 0, num = 1, i;

        while (count < n) {

            num += 1;

            for (i = 2; i <= num; i++) {

                if (num % i == 0) {

                    break;
                }
            }

            if (i == num) {

                count += 1;
            }


        }
        System.out.println("The " + n + " nth value prime number is: " + num);


    }

}
