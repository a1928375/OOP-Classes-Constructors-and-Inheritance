package com.company;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();

        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);

        System.out.println("The full name is " + person.getFullName());
        System.out.println("The teen is " + person.isTeen());

        person.setFirstName("John");
        person.setAge(18);

        System.out.println("The full name is " + person.getFirstName());
        System.out.println("The teen is " + person.isTeen());

        person.setLastName("Smith");
        System.out.println("The full name is " + person.getFullName());
    }
}
