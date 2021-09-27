package by.academy.classwork.lesson15;

import java.util.function.Predicate;

public class Task2 {

	public static void main(String[] args) {
		Predicate<String> pred = s -> s != null;
		String str = "";
		System.out.println(pred.test(str));
	}
}
