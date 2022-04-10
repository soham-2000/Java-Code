package com.code.exersice;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometerPerHour) {

        if (kilometerPerHour < 0) {

            return -1;

        }
        return Math.round(kilometerPerHour / 1.609);

    }

    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {

            System.out.println("INVALID VALUE");

        } else {

            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + "km/h = " + milesPerHour + "mi/h");

        }

    }

    public static void main(String[] ags) {

        printConversion(10.5);
    }

}	

