package Lesson11_07_21;

public class Task1_4 {
//	Перепишите программу:
	//		public class Main {
	//		 public static void main(String[] args) {
	//		  int s = 370_000;
	//		  int sec;
	//		  int m;
	//		  int min;
	//		  int h;
	//		  sec = s % 60;
	//		  m = (s - sec) / 60;
	//		  min = m % 60;
	//		  h = (m - min) / 60;
	//		  System.out.println(h + " часов " + min + " минут " + sec + " секунд");
	//		 }
	//		}
	// Продолжить пример, добавить расчет и вывод суток и недель. (месяц по желанию)
	
	public static void main(String[] args) {
		int s = 370_000;
		  int sec;
		  int m;
		  int min;
		  int h;
		  int hour;
		  int day;
		  int d;
		  int w;
		  int week;
		  int month;
		  int mon;
		  sec = s % 60;
		  m = (s - sec) / 60;
		  min = m % 60;
		  h = (m - min) / 60;
		  hour = h % 24;
		  d = (h - hour) / 24;
		  month = d / 30;
		  mon = month * 30;
		  w = d % 30;
		  week = w / 7;
		  day = (d - mon) % 7;

		  System.out.println(month + " месяцев " + week + " недель " + day + " суток " 
		                     + hour + " часов " + min + " минут " + sec + " секунд");

	}

}
