package by.academy.classwork.lesson15;

import java.util.function.Function;

public class Task7 {

	public static void main(String[] args) {
		Function<Integer, Boolean> function = b -> {
			if(b == 0) {
				System.out.println("Число равно 0");
			}else if(b > 0) {
				System.out.println("Число положительное");
			}else {
				System.out.println("Число отрицательное");
			}
			return null;
		};
	}
	function.aply

}
