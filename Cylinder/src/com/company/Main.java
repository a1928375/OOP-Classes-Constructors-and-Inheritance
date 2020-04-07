package com.company;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(3.75);
        System.out.println("circle radius is " + circle.getRadius());
        System.out.println("circle area is " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55,7.25);
        System.out.println("cylinder radius is " + cylinder.getRadius());
        System.out.println("cylinder height is " + cylinder.getHeight());
        System.out.println("cylinder area is " + cylinder.getArea());
        System.out.println("cylinder volume is " + cylinder.getVolume());
    }
}
