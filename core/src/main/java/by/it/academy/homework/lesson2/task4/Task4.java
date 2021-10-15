package by.it.academy.homework.lesson2.task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word consisting of an even number of characters: ");
        String firstWord = scan.nextLine();
        System.out.println("Enter a second word consisting of an even number of characters: ");
        String secondWord = scan.nextLine();

        if (firstWord.length() % 2 == 0 && secondWord.length() % 2 == 0) {
            System.out.println(
                    firstWord.substring(0, firstWord.length() / 2) + secondWord.substring(secondWord.length() / 2));
        } else {
            System.out.println("Entered word or two words have an odd number of characters");
        }
        scan.close();
    }
}