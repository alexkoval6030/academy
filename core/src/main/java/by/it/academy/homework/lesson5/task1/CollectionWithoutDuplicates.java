package by.it.academy.homework.lesson5.task1;

import java.util.*;

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
        Collection<Integer> arrayListIntegerDemo = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 4, 6, 8, 10));
        Collection<Integer> linkedListIntegerDemo = new LinkedList<>(
                List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 4, 6, 8, 10));
        Collection<String> arrayListStringDemo = new ArrayList<>(
                Arrays.asList("a", "b", "c", "d", "A", "B", "C", "D", "b", "d", "A", "C"));

        System.out.println(arrayListIntegerDemo);
        collectionWithDublicates(arrayListIntegerDemo);
        System.out.println(arrayListIntegerDemo);
        System.out.println("--------------");
        System.out.println(linkedListIntegerDemo);
        collectionWithDublicates(linkedListIntegerDemo);
        System.out.println(linkedListIntegerDemo);
        System.out.println("--------------");
        System.out.println(arrayListStringDemo);
        collectionWithDublicates(arrayListStringDemo);
        System.out.println(arrayListStringDemo);
    }
}