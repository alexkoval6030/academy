package Lesson11_07_21;
//¬вести через консоль название мес€ца
//вывести номер мес€ца (использовать switch/case)

import java.util.Scanner;

public class Task1_0 {

	public static void main(String[] args) {
		System.out.println("¬ведите название мес€ца");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
				
		switch(str) {
		case "январь":
			System.out.println(1);
			break;
		case "‘евраль":
			System.out.println(2);
			break;
		case "ћарт":
			System.out.println(3);
			break;
		case "јпрель":
			System.out.println(4);
			break;
		case "ћай":
			System.out.println(5);
			break;
		case "»юнь":
			System.out.println(6);
			break;
		case "»юль":
			System.out.println(7);
			break;
		case "јвгуст":
			System.out.println(8);
			break;
		case "—ент€брь":
			System.out.println(9);
			break;
		case "ќкт€брь":
			System.out.println(10);
			break;
		case "Ќо€брь":
			System.out.println(11);
			break;
		case "ƒекабрь":
			System.out.println(12);
			break;
		default:
			System.out.println("“акого мес€ца не существует");
		}

		scan.close();
	}
}
