package com.code.exersice;

public class Main {

    public static void main(String[] args) {

        Carpet c = new Carpet(3.5);
        Floor f = new Floor(2.75, 4.0);
        Calculator cal = new Calculator(f, c);

        System.out.println("Total cost is= " + cal.getTotalCost());
        c = new Carpet(1.5);
        f = new Floor(5.4, 4.5);
        cal = new Calculator(f, c);
        System.out.println("Total cost is= " + cal.getTotalCost());

    }

}
