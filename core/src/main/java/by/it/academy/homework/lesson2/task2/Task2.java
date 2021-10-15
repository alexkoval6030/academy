package by.it.academy.homework.lesson2.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String firstWord = scan.nextLine();
        System.out.println("Enter second word: ");
        String secondWord = scan.nextLine();
        char[] firstWordArray = firstWord.toCharArray();

        if ((firstWord.length() != secondWord.length())) {
            System.out.println("False");
            scan.close();
            return;
        }
        for (int i = 0; i < secondWord.length(); i++) {
            for (int j = 0; j < firstWordArray.length; j++) {
                if (secondWord.charAt(i) == firstWord.charAt(j)) {
                    firstWordArray[j] = ' ';
                }
            }
        }
        firstWord = String.valueOf(firstWordArray);
        if (firstWord.trim().isEmpty()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        scan.close();
    }
}