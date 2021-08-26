package by.academy.homework5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionWithoutDuplicates {

	public static <E> void collectionWithDublicates(Collection<E> elements) {

		HashSet<E> eWithoutDuplicate = new HashSet<>(elements);

		Iterator<E> iterator = elements.iterator();
		while (iterator.hasNext()) {
			E element = iterator.next();
			boolean remove = eWithoutDuplicate.remove(element);
			if (!remove) {
				iterator.remove();
			}
		}
	}

	public static void main(String[] args) {

//		Collection<Integer> collectionDemo = new ArrayList<>(
//				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 4, 6, 8, 10));
		Collection<Integer> collectionDemo = new LinkedList<>(
				List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 4, 6, 8, 10));
//		Collection<String> collectionDemo = new ArrayList<>(
//				Arrays.asList("a", "b", "c", "d", "A", "B", "C", "D", "b", "d", "A", "C"));
		System.out.println(collectionDemo);
		collectionWithDublicates(collectionDemo);
		System.out.println(collectionDemo);
	}
}
