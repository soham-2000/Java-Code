package com.code.exersice;

public class AreaCalculator {

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        double r = radius;
        double circleArea = Math.PI * r * r;
        return circleArea;
    }

    public static double area(double x, double y) {
        if ((x < 0) || (y < 0)) {
            return -1.0;
        }
        double rectangleArea = x * y;
        return rectangleArea;
    }


    public static void main(String[] args) {
        double circleArea = area(5);
        double triangleArea = area(5, 3);
        System.out.println(circleArea);
        System.out.println(triangleArea);


    }

}
