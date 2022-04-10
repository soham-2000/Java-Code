package com.code.exersice;

public class MegaBytesConvertor {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");

        } else {

            int megabytes = kiloBytes / 1024;
            long kilobytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megabytes + " MB" + " and " + kilobytes + " KB");
        }
    }

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(1455);
        printMegaBytesAndKiloBytes(-1200);


    }

}
