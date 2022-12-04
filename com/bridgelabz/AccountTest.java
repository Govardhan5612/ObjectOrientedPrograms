package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Govardhan Reddy
 */

public class AccountTest {
    /**
     *test the debit method
     */
    public static void main(String[] args) {
        /**
         * in main method call Account class debit method
         */
        Account account = new Account();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the withdraw amount : ");
        double debitAmount = input.nextDouble();
        account.debit(debitAmount);
    }
}
