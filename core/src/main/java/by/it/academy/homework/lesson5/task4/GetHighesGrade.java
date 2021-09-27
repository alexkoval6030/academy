package by.it.academy.homework.lesson5.task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GetHighesGrade {

	public static void main(String[] args) {
		List<Integer> grades = new ArrayList<>(20);
		
		for (int i = 0; i < 20; i++) {
			int j = (int)(1 + Math.random() * 10);
			grades.add(j);
		}
		System.out.println(grades);
		
		Iterator<Integer> iterator = grades.iterator();
		int highesGrade = iterator.next();
		while (iterator.hasNext()) {
			int currentGrade = iterator.next();
			if(currentGrade > highesGrade) {
				highesGrade = currentGrade;
			}
		}
		System.out.print("Highes Grade: " + highesGrade);

	}

}
