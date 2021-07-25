package by.academy.homework2;

import java.util.Scanner;

public class Deal {

    public static void main(String[] args) {
        String[] cards = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};
        String[] suits = new String[]{"spades ", "hearts ", "diamond", "clubs  "};

        String[][] deckOfCards = new String[13][4];

        for (int i = 0; i < deckOfCards.length; i++) {
            for (int j = 0; j < deckOfCards[i].length; j++) {
                String card = cards[i] + " " + suits[j];
                deckOfCards[i][j] = card;
            }
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of players");
        int numberOfPlayers = scan.nextInt();
        for (int i = 0; i < numberOfPlayers; i++) {
            String playerCards = "";
            for (int j = 0; j < 5; ) {
                int firstNumber = (int) (Math.random() * cards.length);
                int secondNumber = (int) (Math.random() * suits.length);
                if (deckOfCards[firstNumber][secondNumber] != null) {
                    playerCards += deckOfCards[firstNumber][secondNumber] + " ";
                    deckOfCards[firstNumber][secondNumber] = null;
                    j++;
                }
            }
            System.out.println("Cards Player Number" + i + " : " + playerCards);
            scan.close();
        }
    }
}