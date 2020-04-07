package com.company;

public class Main {

    public static void main(String[] args) {

        Point first = new Point(6,5);
        Point second = new Point(3,1);

        System.out.println("The distance from (0,0) is " + first.distance());
        System.out.println("The distance from second point is " + first.distance(second));
        System.out.println("The distance from (2,3) is " + first.distance(2,2));

        Point point = new Point();
        System.out.println("The distance from (0,0) is " + point.distance());
    }
}
