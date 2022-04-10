package com.code.exersice;

public class EvenNumber {

    public static boolean isEvenNumber(int number) {

        return number % 2 == 0;
    }


    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;
        int TotalEven = 0;

        while (number <= finishNumber) {
            number++;

            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even Number: " + number);

            TotalEven++;
            if (TotalEven >= 5) {
                break;
            }


        }

        System.out.println("Total even number are: " + TotalEven);

    }

}
