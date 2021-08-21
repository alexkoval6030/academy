package by.academy.homework5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class CollectionWithoutDuplicates {
	public static <T> Collection<T> collectionWithDublicates(Collection<T> collection) {
		return new HashSet<T>(collection);
	}

	public static void main(String[] args) {

//		Collection<Integer> collectionDemo = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 4, 6, 8, 10));
//		Collection<Integer> collectionDemo = new LinkedList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 4, 6, 8, 10));
		Collection<String> collectionDemo = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "A", "B", "C", "D", "b", "d", "A", "C"));
		System.out.println(collectionDemo);
		collectionDemo = collectionWithDublicates(collectionDemo);
		System.out.println(collectionDemo);
	}
}
