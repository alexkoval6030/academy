package by.academy.classwork.lesson15;

import java.util.function.Predicate;

public class Task3 {
	public static void main(String[] args) {
		Predicate<String> pred = s -> !s.equals("");
		String str = "false";
		System.out.println(pred.test(str));
	}
}
