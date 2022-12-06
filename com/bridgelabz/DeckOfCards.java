package com.bridgelabz;

/**
 * @author Govardhan Reddy
 */
public class DeckOfCards {
    /**
     * print the four player deck of cards
     */
    public static void main(String[] args) {
        int[] deckOfCard = new int[52];
        int[][] players = new int[4][13];
        generateCard(deckOfCard);
        printCard(deckOfCard);
        printHands(4, 13);

    }

    public static void generateCard(int[] deckOfCard) {


        for (int i = 0; i < deckOfCard.length; i++)
            deckOfCard[i] = i;


        for (int i = 0; i < deckOfCard.length; i++) {
            /**
             * use random method get values from 0 to 51
             * change deck values concept of swapping of two numbers
             */
            int index = (int) (Math.random() * deckOfCard.length);
            int duplicate = deckOfCard[i];
            deckOfCard[i] = deckOfCard[index];
            deckOfCard[index] = duplicate;
        }
    }

    public static void printCard(int[] deckOfCard) {
        /**
         * printing four player values
         */
        for (int i = 0; i < deckOfCard.length; i++) {
            System.out.print(deckOfCard[i] + " , ");
            if (i == 12) System.out.println();
            if (i == 25) System.out.println();
            if (i == 38) System.out.println();
        }
    }


    public static void printHands(int suit, int rank) {
        /**
         *
         */
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    }
}
