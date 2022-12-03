package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Govardhan Reddy
 */
public class StockPortfolio {
    /**
     * calculate the stock report
     */
    Scanner input = new Scanner(System.in);
    Stock stock = new Stock();

    public void createReport() {
        /**
         * add details
         */
        System.out.print("Enter the share name : ");
        stock.setStockName(input.next());
        System.out.print("Enter the share price : ");
        stock.setSharePrice(input.nextInt());
        System.out.print("Enter the number of shares : ");
        stock.setNumberOfShares(input.nextInt());

    }

    public void printReport() {
        /**
         * print the stock details
         */
        createReport();
        System.out.println("Stock Report : ");
        System.out.println("Share name : " + stock.getStockName());
        System.out.println("Number of shares : " + stock.getNumberOfShares());
        System.out.println("One share price : Rs." + stock.getSharePrice());
        System.out.println("Total price of shares : Rs." + (stock.getSharePrice() * stock.getNumberOfShares()));

    }

    public static void main(String[] args) {
        StockPortfolio report = new StockPortfolio();
        report.printReport();
    }
}
