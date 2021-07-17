package by.academy.classwork.lesson4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

	//Дана строка “Versions: Java  5, Java 6, Java   7, Java 8, Java 12.”  
	//Найти все подстроки "Java <X>" и распечатать их.
	//
	public static void main(String[] args) {
		String str = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
		Pattern pattern = Pattern.compile("/[Java]+\\s*\\d*");
		Matcher matcher = pattern.matcher(str);
        System.out.println(pattern.flags());
        }
	}

}
