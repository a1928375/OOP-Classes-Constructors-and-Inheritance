package com.company;

public class Car extends Vehicle {

    private int steering;
    private int gears;
    private int year;
    private String type;

        public Car (int steering, int gears, int year, String type) {

        super("Land", 500, "Carry");
        this.steering = steering;
        this.gears = gears;
        this.year = year;
        this.type = type;

    }

    public int getSteering () {
            return this.steering;
    }

    public int getGears() {
        return gears;
    }

    public int getYear() {
        return year;
    }

    public String getType() {
        return type;
    }
}
