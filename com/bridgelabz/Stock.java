package com.bridgelabz;

/**
 * @author Govardhan Reddy
 */
public class Stock {
    /**
     * create a stock details
     */
    private String stockName;
    private int sharePrice, NumberOfShares;

    /**
     * providing get and set methods
     */

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
    }

    public int getNumberOfShares() {
        return NumberOfShares;
    }

    public void setNumberOfShares(int numberOfShares) {
        NumberOfShares = numberOfShares;
    }
}
