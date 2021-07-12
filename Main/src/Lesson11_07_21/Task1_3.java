package Lesson11_07_21;

import java.util.Scanner;

public class Task1_3 {
	//Создайте число. Определите, является ли число четным или не четным,
	//вывести текстовое сообщение
	public static void main(String[] args) {
		System.out.println("Введите число");
		
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		
		if(i % 2 == 0) {
			System.out.println("Число " + i + " чётное");
		}
		else {
			System.out.println("Число " + i + " нечётное");
		}
		
		scan.close();
	}

}
