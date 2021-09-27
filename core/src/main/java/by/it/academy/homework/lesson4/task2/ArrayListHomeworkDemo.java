package by.it.academy.homework.lesson4.task2;

import java.util.Arrays;

public class ArrayListHomeworkDemo {

	public static void main(String[] args) {
		Integer [] arrInt = {1,2,3};
		ArrayListHomework<Integer> obj = new ArrayListHomework<>(arrInt);
		System.out.println(Arrays.toString(obj.getItems()));
		
		obj.add(4);
		obj.add(32);
		obj.add(6);
		System.out.println(Arrays.toString(obj.getItems()));
		System.out.println(obj.get(5));
		obj.get(6);
		System.out.println(Arrays.toString(obj.getItems()));
		System.out.println(obj.getLast());
		obj.remove(2);
		System.out.println(Arrays.toString(obj.getItems()));
		obj.remove(32);
		System.out.println(Arrays.toString(obj.getItems()));
		obj.remove(7);
		obj.remove(4);
		System.out.println(obj.getLast());
		System.out.println(obj.getFirst());
		System.out.println(obj.arraySize());
		System.out.println(obj.indexOfTheLastFilledArrayElement());
	
	}

}
