package com.company;

public class Main {

    public static void main(String[] args) {

        ComplexNumber one = new ComplexNumber(1.0,1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);

        one.add(1,1);
        System.out.println("The real part of one is " + one.getReal());
        System.out.println("The imaginary part of the one is " + one.getImaginary());

        one.subtract(number);
        System.out.println("The real part of one is " + one.getReal());
        System.out.println("The imaginary part of the one is " + one.getImaginary());

        number.subtract(one);
        System.out.println("The real part of number is " + number.getReal());
        System.out.println("The imaginary part of the number is " + number.getImaginary());
    }
}
