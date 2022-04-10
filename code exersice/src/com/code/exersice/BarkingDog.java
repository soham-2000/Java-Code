package com.code.exersice;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (!barking || hourOfDay < 0 || hourOfDay > 23 || (hourOfDay > 7 && hourOfDay < 23)) {

            System.out.println(barking);
            System.out.println(hourOfDay);
            return false;

        }
        return true;
    }


    public static void main(String[] args) {

        shouldWakeUp(true, 22);

    }

}
