package by.academy.homework5;

import java.util.ArrayList;
import java.util.Iterator;

public class GetHighesGrade {

	public static void main(String[] args) {
		ArrayList<Integer> grades = new ArrayList<>(20);
		
		for (int i = 0; i < 20; i++) {
			int j = (int)(1 + Math.random() * 10);
			grades.add(j);
		}
		System.out.println(grades);
		
		Iterator<Integer> iterator = grades.iterator();
		int highesGrade = iterator.next();
		while (iterator.hasNext()) {
			int i = iterator.next();
			if(i > highesGrade) {
				highesGrade = i;
			}
		}
		System.out.print("Highes Grade: " + highesGrade);

	}

}
