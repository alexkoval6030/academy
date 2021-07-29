package by.academy.classwork.lesson8;

import java.time.LocalDate;

public class LocalDate1 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(1988, 11, 23);
		
		System.out.println(date.getYear());
		System.out.println(date.get());

	}

}
