package by.academy.homework1;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите тип переменной : ");
				
		switch (scanner.nextLine()) {
		case "int":
			System.out.print("Введите целое число: ");
			int i = scanner.nextInt();
			System.out.println(i = i % 2);
			break;
		case "double":
			System.out.print("Введите дробное число (использовать запятую): ");
			double d = scanner.nextDouble();
			System.out.println(d = d * 0.7);
			break;
		case "float":
			System.out.print("Введите дробное число (использовать запятую): ");
			float f = scanner.nextFloat();
			System.out.println(f *= f);
			break;
		case "char":
			System.out.print("Введите символ: ");
			String str = scanner.nextLine();
			char c = str.charAt(0);
			System.out.println((int)c);
			break;
		case "String":
			System.out.print("Введите строку: ");
			String str1 = scanner.nextLine();
			System.out.println("Hello " + str1);
			break;
		default:
			System.out.print("Unsupported type");
		}
		
		scanner.close();
	}
}
