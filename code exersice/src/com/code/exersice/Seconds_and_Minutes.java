package com.code.exersice;

public class Seconds_and_Minutes {

    public static String getDurationString(long minutes, long seconds) {

        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {

            return "OUT OF TIME";
        }

        long hours = minutes / 60;
        long Remainingminutes = (minutes % 60);
        String time = hours + "h " + Remainingminutes + "m " + seconds + " s";

        return time;

    }

    public static String getDurationString(long seconds) {

        if (seconds < 0) {
            return "OUT OF TIME";
        }

        long minutes = seconds / 60;
        long Remainingseconds = seconds % 60;

        return getDurationString(minutes, Remainingseconds);
    }

    public static void main(String[] args) {

        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(900L));

    }

}
