package com.company;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle width is " + rectangle.getWidth());
        System.out.println("rectangle length is " + rectangle.getLength());
        System.out.println("rectangle area is " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid width is " + cuboid.getWidth());
        System.out.println("cuboid length is " + cuboid.getLength());
        System.out.println("cuboid height is " + cuboid.getHeight());
        System.out.println("cuboid area is " + cuboid.getArea());
        System.out.println("cuboid volume is " + cuboid.getVolume());

        cuboid = new Cuboid(-5,-10,-5);
        System.out.println("cuboid width is " + cuboid.getWidth());
        System.out.println("cuboid length is " + cuboid.getLength());
        System.out.println("cuboid height is " + cuboid.getHeight());

    }
}
