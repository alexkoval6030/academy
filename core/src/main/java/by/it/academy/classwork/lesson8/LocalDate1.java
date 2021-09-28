package java.by.it.academy.classwork.lesson8;

import java.time.LocalDate;

public class LocalDate1 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(1988, 11, 23);
		
		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.getDayOfYear());
		System.out.println(date.getDayOfWeek());
		
		LocalDate date1 = LocalDate.now();
		System.out.println(date1.isAfter(date));
		System.out.println(date1.isBefore(date));

	}

}
