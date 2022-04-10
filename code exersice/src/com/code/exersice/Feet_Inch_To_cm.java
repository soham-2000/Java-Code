package com.code.exersice;

public class Feet_Inch_To_cm {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if ((feet < 0) || ((inches < 0) || (inches > 12))) {

            System.out.println("Invalid values provided!!");
            return -1;

        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + "ft, " + inches + "inches = " + centimeters + " cm");

        return centimeters;

    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        if (inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remaininginches = (int) inches % 12;
        System.out.println(inches + "inches = " + feet + "ft and " + remaininginches + "inches");

        return calcFeetAndInchesToCentimeters(feet, remaininginches);
    }


    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(6, 0);
        calcFeetAndInchesToCentimeters(157);


    }

}
