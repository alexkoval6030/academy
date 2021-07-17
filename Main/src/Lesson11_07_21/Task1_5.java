package Lesson11_07_21;
//Ввести с консоли 2 числа, найти большее, меньшее, среднее арифметическое.
import java.util.Scanner;

public class Task1_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите два числа");
		int i = scan.nextInt();
		int j = scan.nextInt();
				
		if(i > j) {
			System.out.println("Большее число " + i + ", Меньшее число " + j + 
					", среднее арифметическое " + (i + j) / 2);
		}
		else {
			System.out.println("Большее число " + j + ", Меньшее число " + i +
					", среднее арифметическое " + (i + j) / 2);
		}

		scan.close();
	}

}

