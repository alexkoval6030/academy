package by.academy.homework2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число сравниваемых слов");
        int numberOfWordsToCompare = scan.nextInt();
        String[] wordArray = new String[numberOfWordsToCompare];

        for (int i = 0; i < wordArray.length; i++) {
            System.out.println("Введите слово");
            wordArray[i] = scan.next();
        }

        int minUnique = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int j = 0; j < wordArray.length; j++) {
            String word = wordArray[j];
            char[] chars = word.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                for (int k = i + 1; k < chars.length; k++) {
                    if (chars[i] == chars[k]) {
                        chars[k] = ' ';
                    }
                }
            }
            int uniqueLetterCount = 0;
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] != ' ') {
                    uniqueLetterCount++;
                }
            }
            if (uniqueLetterCount < minUnique) {
                minUnique = uniqueLetterCount;
                minIndex = j;
            }
        }

        System.out.println(wordArray[minIndex]);
        scan.close();
    }
}
