package com.company;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {

        this (0,0);
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

    public double distance () {

        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public double distance (int x1, int y1) {

        return Math.sqrt((this.x - x1) * (this.x - x1) + (this.y - y1) * (this.y - y1));
    }

    public double distance (Point another) {

        return Math.sqrt((this.x-another.x) * (this.x-another.x) + (this.y-another.y) * (this.y-another.y));
    }
}
