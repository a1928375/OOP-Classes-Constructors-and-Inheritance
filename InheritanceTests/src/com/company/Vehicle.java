package com.company;

public class Vehicle {

    private String move;
    private int speed;
    private String purpose;

    public Vehicle (String move, int speed, String purpose) {

        this.move = move;
        this.speed = speed;
        this.purpose = purpose;
    }

    public String getMove () {

        return this.move;
    }

    public int getSpeed() {
        return speed;
    }

    public String getPurpose() {
        return purpose;
    }
}
