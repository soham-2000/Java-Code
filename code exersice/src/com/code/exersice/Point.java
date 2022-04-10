package com.code.exersice;

public class Point {

    private int x;
    private int y;


    public Point() {

        this(0, 0);
    }

    public Point(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("Distance(0,0)= " + first.distance());
        System.out.println("Distance(3,1)= " + first.distance(second));
        System.out.println("Distance(2,2)= " + first.distance(2, 2));
        Point p = new Point();
        System.out.println("Distance()= " + p.distance());

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {

        return Math.sqrt((getX() - 0) * (getX() - 0) + (getY() - 0) * (getY() - 0));
    }

    public double distance(int x, int y) {

        return Math.sqrt((getX() - x) * (getX() - x) + (getY() - y) * (getY() - y));
    }

    public double distance(Point xy) {

        return Math.sqrt((getX() - xy.getX()) * (getX() - xy.getX()) + (getY() - xy.getY()) * (getY() - xy.getY()));
    }

}
