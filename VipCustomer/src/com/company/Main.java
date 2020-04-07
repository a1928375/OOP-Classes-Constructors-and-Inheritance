package com.company;

public class Main {

    public static void main(String[] args) {

        VipCustomer vipCustomer = new VipCustomer();
        System.out.println("The name is " + vipCustomer.getName());
        System.out.println("The credit limit is " + vipCustomer.getCreditLimit());
        System.out.println("The email address is " + vipCustomer.getEmailAddress());

        VipCustomer abc = new VipCustomer("Tina", 1000000000,"tina@gmail.com");
        System.out.println("The name is " + abc.getName());
        System.out.println("The credit limit is " + abc.getCreditLimit());
        System.out.println("The email address is " + abc.getEmailAddress());

        VipCustomer hij = new VipCustomer(10000000, "amy@gmail.com");
        System.out.println("The name is " + hij.getName());
        System.out.println("The credit limit is " + hij.getCreditLimit());
        System.out.println("The email address is " + hij.getEmailAddress());

    }
}
