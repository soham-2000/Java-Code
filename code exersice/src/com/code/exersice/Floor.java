package com.code.exersice;

public class Floor {


    private final double length;
    private final double width;


    public Floor(double length, double width) {
        super();
        this.length = length < 0 ? 0 : length;
        this.width = width < 0 ? 0 : width;
    }

    public double getArea() {

        return length * width;
    }

}	

