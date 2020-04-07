package com.company;

import java.util.SortedMap;

public class VipCustomer {

    private String name;
    private int creditLimit;
    private String emailAddress;

    public VipCustomer (String name, int creditLimit, String emailAddress) {

        System.out.println("Constructors with parameters called");
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer () {

        this ("Jenny", 10000000, "tina@gmail.com");
        System.out.println("Empty constructor called");
    }

    public VipCustomer (int creditLimit, String emailAddress) {

        this ("Jenny", creditLimit, emailAddress);
        System.out.println("Partial constructor called");
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}

