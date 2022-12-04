package com.bridgelabz;

public class Account {
    private double accountBalance = 10000;
    private double currentBalance;

    public void debit(double debitAmount) {
        /**
         * in this method debit amount con not exceed actual amount
         */
        if (accountBalance >= debitAmount) {
            System.out.println("Withdraw amount : " + debitAmount);
            currentBalance = accountBalance - debitAmount;
            System.out.println("Current balance : " + currentBalance);
        } else {
            System.out.println("Your Account have insufficient balance");
            currentBalance = accountBalance;
            System.out.println("Current balance : " + currentBalance);
        }
    }
}
