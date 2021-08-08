package by.academy.homework4;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Date {

	Day day;
	Month month;
	Year year;

	public Date(Year year, Month month, Day day) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public Date(String date) {
		if (validator(date) == true) {
			String[] arrayData = date.split("-");
			day = new Day(Integer.parseInt(arrayData[0]));
			month = new Month(Integer.parseInt(arrayData[1]));
			year = new Year(Integer.parseInt(arrayData[2]));
		} else {
			System.out.println("Date entered incorrectly");
		}
	}

	public boolean validator(String date) {
		Pattern datePattern = Pattern.compile("(0?[1-9]|[12][0-9]|3[01])-(0?[13578]|1[02])-(\\d{4})");
		Pattern datePattern1 = Pattern.compile("(0?[1-9]|[12][0-9]|3[0])-(0?[469]|1{2})-(\\d{4})");
		Pattern datePattern2 = Pattern.compile("(0?[1-9]|1[0-9]|2[0-9])-(0?2)-(\\d{4})");
		Matcher matcher = datePattern.matcher(date);
		Matcher matcher1 = datePattern1.matcher(date);
		Matcher matcher2 = datePattern2.matcher(date);
		if (matcher.matches() || matcher1.matches() || matcher2.matches()) {
			return true;
		} else {
			return false;
		}
	}

	public Date() {
		super();
	}

	class Day {

		private int day;

		public Day(int day) {
			this.day = day;
		}

		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			this.day = day;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + Objects.hash(day);
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Day other = (Day) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			return day == other.day;
		}

		private Date getEnclosingInstance() {
			return Date.this;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Day [day=");
			builder.append(day);
			builder.append("]");
			return builder.toString();
		}
	}

	class Month {

		private int month;

		public Month(int month) {
			this.month = month;
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			this.month = month;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + Objects.hash(month);
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Month other = (Month) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			return month == other.month;
		}

		private Date getEnclosingInstance() {
			return Date.this;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Month [month=");
			builder.append(month);
			builder.append("]");
			return builder.toString();
		}
	}

	class Year {

		private int year;

		public Year(int year) {
			this.year = year;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + Objects.hash(year);
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Year other = (Year) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			return year == other.year;
		}

		private Date getEnclosingInstance() {
			return Date.this;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Year [year=");
			builder.append(year);
			builder.append("]");
			return builder.toString();
		}
	}

	public void getTheDayOfTheWeekByDate() {
		if (validator(day.getDay() + "-" + month.getMonth() + "-" + year.getYear()) == true) {
			LocalDate dayOfWeekByDate = LocalDate.of(year.getYear(), month.getMonth(), day.getDay());
			System.out.println(dayOfWeekByDate.getDayOfWeek());
		} else {
			System.out.println("Date entered incorrectly");
		}
	}

	public void numberOfDaysFromTheGivenDateToTheCurrentDate() {
		if (validator(day.getDay() + "-" + month.getMonth() + "-" + year.getYear()) == true) {
			LocalDate givenDate = LocalDate.of(year.getYear(), month.getMonth(), day.getDay());
			LocalDate currentDate = LocalDate.now();
			Period dif = Period.between(givenDate, currentDate);
			long difference = ChronoUnit.DAYS.between(givenDate, currentDate);
			System.out.println("difference of " + dif.getYears() + "year/years " + dif.getMonths() + "month/months "
					+ dif.getDays() + "day/days or " + difference + "days total");
		}
	}
	
	public void leapYear() {
		LocalDate leapYear = LocalDate.of(year.getYear(), month.getMonth(), day.getDay());
		leapYear.isLeapYear();
		if(leapYear.isLeapYear() == true) {
			System.out.println(year.getYear() + " is a leap year");
		}else {
			System.out.println(year.getYear() + " is not leap year");
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return Objects.equals(day, other.day) && Objects.equals(month, other.month) && Objects.equals(year, other.year);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Date [day=");
		builder.append(day);
		builder.append(", month=");
		builder.append(month);
		builder.append(", year=");
		builder.append(year);
		builder.append("]");
		return builder.toString();
	}

}
