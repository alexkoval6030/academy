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
		
		String wordWithMinimumNumberOfCharacters = wordArray[0];

		for (int j = 1; j < wordArray.length; j++) {
			if (wordArray[j].length() < wordWithMinimumNumberOfCharacters.length()) {
				wordWithMinimumNumberOfCharacters = wordArray[j];
			}
		}

		System.out.println(wordWithMinimumNumberOfCharacters);
		scan.close();
	}

}
