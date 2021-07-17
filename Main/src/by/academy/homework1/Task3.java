package by.academy.homework1;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("¬ведите число от 1 до 10: ");
		int i = scanner.nextInt();
	
		for(int j = 1; j <= 10; j++) {
			System.out.println(j + " * " + i + " = " + j * i);
		}
		
		scanner.close();
	}
}
