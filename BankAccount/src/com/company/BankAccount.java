package com.company;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public BankAccount() {

        this(123456, 100000000, "Jenny", "123@123.com", 1111111111);
        System.out.println("Empty constructor called");
    }

    public BankAccount (int accountNumber, double balance, String customerName, String email, long phoneNumber) {

        System.out.println("Constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

    public void setCustomerName (String customerName) {
        this.customerName = customerName;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public void setPhoneNumber (long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber () {
        return this.accountNumber;
    }

    public double getBalance () {
        return this.balance;
    }

    public String getCustomerName () {
        return this.customerName;
    }

    public String getEmail () {
        return this.email;
    }

    public long getPhoneNumber () {
        return this.phoneNumber;
    }

    public void depositFunds (double funds) {
        this.balance += funds;
        System.out.println("Yoy deposit " + funds + ", and the balance is " + this.balance + ".");
    }

    public void withdrawFunds (double funds) {

        if (this.balance < funds) {

            System.out.println("The money in your account is not enough to withdraw.");
        } else {
            this.balance -= funds;
            System.out.println("You withdraw " + funds + ", and the balance is " + this.balance + ".");
        }
    }

}
