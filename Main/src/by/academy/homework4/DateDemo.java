package by.academy.homework4;

public class DateDemo {

	public static void main(String[] args) {
		
		Date date = new Date("23-11-1988");
		System.out.println(date);
		date.getTheDayOfTheWeekByDate();
		date.numberOfDaysFromTheGivenDateToTheCurrentDate();
		date.leapYear();

	}

}
