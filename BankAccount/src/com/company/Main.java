package com.company;

public class Main {

    public static void main(String[] args) {

//        BankAccount bankAccount = new BankAccount();
        BankAccount bankAccount = new BankAccount(1133668899, 896321968, "Tina", "tina@gmail.com", 88888899999L);

//        bankAccount.setAccountNumber(1133668899);
//        bankAccount.setBalance(896321968);
//        bankAccount.setCustomerName("Tina");
//        bankAccount.setEmail("tina@gmail.com");
//        bankAccount.setPhoneNumber(88888899999L);

        System.out.println("Your account number is " + bankAccount.getAccountNumber());
        System.out.println("Your balance is " +bankAccount.getBalance());
        System.out.println("Your name is " +bankAccount.getCustomerName());
        System.out.println("Your email is " +bankAccount.getEmail());
        System.out.println("Your phone number is " +bankAccount.getPhoneNumber());

        bankAccount.depositFunds(668);

        bankAccount.withdrawFunds(99999999999999999999D);
        bankAccount.withdrawFunds(99999);

    }

}
