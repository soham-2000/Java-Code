package com.code.exersice;

public class Wall {

    private double width;
    private double height;


    public Wall() {
        this(0.0, 0.0);
    }


    public Wall(double width, double height) {
        super();
        this.width = width < 0 ? 0 : width;
        this.height = height < 0 ? 0 : height;
    }

    public static void main(String[] args) {

        Wall w = new Wall(5, 4);
        System.out.println("Area= " + w.getArea());

        w.setHeight(-1.5);
        System.out.println("Width= " + w.getWidth());
        System.out.println("Height= " + w.getHeight());
        System.out.println("Area= " + w.getArea());

        w.setHeight(-1.25);
        w.setWidth(-1.25);
        System.out.println(w.getHeight());
        System.out.println(w.getWidth());
        System.out.println(w.getArea());

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width < 0 ? 0 : width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height < 0 ? 0 : height;
    }

    public double getArea() {

        return width * height;
    }

}
