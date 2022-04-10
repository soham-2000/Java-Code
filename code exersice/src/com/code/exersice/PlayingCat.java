package com.code.exersice;

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        {
            int tempLimit = (summer) ? 45 : 35;

            return temperature >= 25 && temperature <= tempLimit;
        }
    }


    public static void main(String[] args) {

        boolean reponse = isCatPlaying(true, 20);
        System.out.println(reponse);

    }

}
