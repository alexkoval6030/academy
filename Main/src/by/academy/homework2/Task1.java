package by.academy.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите первое слово: ");
		String firstWord = scan.nextLine();
		System.out.println("Введите второе слово: ");
		String secondWord = scan.nextLine();
		char[] firstWordArray = firstWord.toCharArray();
		char[] secondWordArray = secondWord.toCharArray();

		if (firstWord.length() == secondWord.length()) {
			for (int i = 0; i < secondWordArray.length; i++) {
				for (int j = 0; j <= firstWordArray.length - 1; j++) {
					if (secondWord.charAt(i) == firstWord.charAt(j)) {
						firstWordArray[j] = ' ';
					}
				}
			}
			firstWord = String.valueOf(firstWordArray);
			if (firstWord.isBlank() == true) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		} else {
			System.out.println("false");
		}

		scan.close();

	}

}
