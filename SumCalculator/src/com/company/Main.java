package com.company;

public class Main {

    public static void main(String[] args) {

        SimpleCalculator simpleCalculator = new SimpleCalculator();

        simpleCalculator.setFirstNumber(5.0);
        simpleCalculator.setSecondNumber(4);

        System.out.println("Sum is " + simpleCalculator.getAdditionResult());
        System.out.println("Difference is " + simpleCalculator.getSubtractionResult());

        simpleCalculator.setFirstNumber(5.25);
        simpleCalculator.setSecondNumber(0);

        System.out.println("Multiplication is " + simpleCalculator.getMultiplicationResult());
        System.out.println("Division is " + simpleCalculator.getDivisionResult());
    }
}
