package by.it.academy.homework.lesson5.task2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TimeComparison {
    public static <T> void addElementsToList(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 50_000_000; i++) {
			list.add((int) (1 + Math.random() * 100));
		}
        long end = System.currentTimeMillis();
        System.out.println("Time to add elements " + (end - start));
    }

    public static <T> void selectRandomItemsFromList(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            list.get((int) (Math.random() * 1_000_000));
        }
        long end = System.currentTimeMillis();
        System.out.println("Selection time of 100,000 items " + (end - start));
    }

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        addElementsToList(array);
		selectRandomItemsFromList(array);
        LinkedList<Integer> linked = new LinkedList<>();
		addElementsToList(linked);
		selectRandomItemsFromList(linked);
    }
}