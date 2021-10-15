package by.it.academy.homework.lesson4.task1;

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date("23-11-1988");
        System.out.println(date);
        date.getTheDayOfTheWeekByDate();
        date.getNumbersOfDaysFromTheGivenDateToTheCurrentDate();
        date.leapYear();
    }
}