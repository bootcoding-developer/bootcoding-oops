package com.bootcoding.oops.basic.coupling.bank;

import java.util.Random;

public class CustomerApplication {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.accountId = generateAccountNumber();
        bankAccount.balance = 10000.00;
        bankAccount.name = "Bootcoding";

        Customer customer = new Customer();
        customer.name = "Bootcoding";
        customer.city = "Nagpur";
        customer.emailId = "bootcoding@gmail.com";
        customer.phone = 917123574418L;
        customer.account = bankAccount;

    }







    private static long generateAccountNumber() {
        Random random = new Random();
        int min = 100000;
        return  min + random.nextInt(10000000 - min);
    }
}
