package by.it.academy.homework.lesson1.task4;

public class Task4 {
	public static void main(String[] args) {
		int degree = 1;
		int result = 2;
				while (result < 1_000_000) {
			System.out.println("2 to the power of " + degree + " = " + result);
			result *= 2;
			degree++;
		}
	}
}