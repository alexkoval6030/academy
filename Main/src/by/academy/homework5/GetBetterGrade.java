package by.academy.homework5;

import java.util.ArrayList;

public class GetBetterGrade {

	public static void main(String[] args) {
		ArrayList<Integer> grades = new ArrayList<>(20);
		for (int i = 0; i < 20; i++) {
			int j = (int)(1 + Math.random() * 10);
			grades.add(j);
		}
		System.out.println(grades);

	}

}
