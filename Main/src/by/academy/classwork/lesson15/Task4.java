package by.academy.classwork.lesson15;

import java.util.function.Predicate;

public class Task4 {

	public static void main(String[] args) {
		Predicate<String> pred = s -> !s.equals("");
		Predicate<String> pred1 = s -> s != null;
		String str = "false";
		System.out.println(pred.and(pred1).test(str));
	}
}
