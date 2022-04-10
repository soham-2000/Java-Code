package com.code.exersice;

public class Carpet {
    private final double cost;

    public Carpet(double cost) {
        super();
        this.cost = cost < 0 ? 0 : cost;
    }

    public double getCost() {
        return cost;
    }

}

