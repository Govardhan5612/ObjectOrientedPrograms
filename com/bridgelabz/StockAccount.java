package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Govardhan Reddy
 */
public class StockAccount {
    /**
     * manage the stocks use array
     */
    String fileName;
    int number;
    double totalAmount;
    String[] stockName;
    double[] price;
    double[] numberOfStocks;

    Scanner input = new Scanner(System.in);

    StockAccount(String fileName) {
        this.fileName = fileName;
    }

    void buy() {
        /**
         * in buy method add the stock name, numbers and price
         */
        System.out.print("Enter how many stocks : ");
        number = input.nextInt();
        price = new double[number];
        stockName = new String[number];
        numberOfStocks = new double[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Enter " + (i + 1) + " company name : ");
            stockName[i] = input.next();
            System.out.print("Enter number of stocks : ");
            numberOfStocks[i] = input.nextDouble();
            System.out.print("Enter stock amount : ");
            price[i] = input.nextDouble();
        }
    }

    void printReport() {
        /**
         * printing the stocks
         */
        System.out.println("Report : ");
        System.out.println("companyName     numberOfStocks      eachStockPrice      totalAmountOfStocks ");
        System.out.println("_________________________________________________________________");
        for (int i = 0; i < number; i++) {
            System.out.println(stockName[i] + " ---------------> " + numberOfStocks[i] + "--------------->" + price[i] + "--------------->" + numberOfStocks[i] * price[i]);
        }
    }

    void sell() {
        /**
         * sale the stocks using array
         */
        System.out.println("Selling : ");
        for (int i = 0; i < number; i++) {
            System.out.print("Enter " + stockName[i] + " sell number of stocks : ");
            numberOfStocks[i] -= input.nextDouble();
        }
    }

    void value() {
        /**
         * calculate total amount after buying and selling
         */
        totalAmount = 0;
        for (int i = 0; i < number; i++) {
            totalAmount += price[i] * numberOfStocks[i];

        }
        System.out.println("**************************");
        System.out.println("Total stocks amount : " + totalAmount);
        System.out.println("**************************");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter file name : ");
        String name = input.next();
        StockAccount s = new StockAccount(name);
        s.buy();
        System.out.println(name + " file After buying : ");
        s.printReport();
        s.value();
        s.sell();
        System.out.println(name + " file After selling : ");
        s.printReport();
        s.value();

    }

}
