package by.academy.homework4;

public class Date {

	Day day;
	Month month;
	Year year;
	
	public Date(Day day, Month month, Year year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Date() {
		super();
	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}

	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) {
		this.month = month;
	}

	public Year getYear() {
		return year;
	}

	public void setYear(Year year) {
		this.year = year;
	}
	
	public void getTheDayOfTheWeekByDate() {
		
	}
	
	class Day {

		private int day = 0;

		public Day(int day) {
			this.day = day;
		}

		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			this.day = day;
		}
	}

	class Month {

		private int month = 0;

		public Month(int month) {
			this.month = month;
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			this.month = month;
		}
	}

	class Year {

		private int year = 0;

		public Year(int year) {
			this.year = year;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}
	}
	
	
}
