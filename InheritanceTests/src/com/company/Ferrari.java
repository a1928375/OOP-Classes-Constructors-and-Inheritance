package com.company;

public class Ferrari extends Car {

    private String model;
    private double acceleratingFor100;
    private String color;

    public Ferrari (int year, String color, String model, double acceleratingFor100) {

        super(1, 10, year, "Sports Car");
        this.model = model;
        this.acceleratingFor100 = acceleratingFor100;
        this.color = color;
    }

    public String getModel () {

        return this.model;
    }

    public double getAcceleratingFor100() {
        return acceleratingFor100;
    }

    public String getColor() {
        return color;
    }
}
