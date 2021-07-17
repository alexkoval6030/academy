package by.academy.homework1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите сумму покупки и возраст покупателя");
		double i = scan.nextDouble();
		double j = scan.nextDouble();
		
		if(i < 100) {
			i = i * 95 / 100;
			System.out.println(i);
		}else if(i >= 100 && i < 200) {
			i = i * 93 / 100;
			System.out.println(i);
		}else if(i >= 200 && i < 300) {
			if(j >= 18) {
				i = i * 84 / 100;
				System.out.println(i);
			}else {
				i = i * 91 / 100;
				System.out.println(i);
			}
		}else if(i >= 300 && i < 400) {
			i = i * 85 / 100;
			System.out.println(i);
		}else {
			i = i * 80 / 100;
			System.out.println(i);
		}
		
		scan.close();
		
	}
}
