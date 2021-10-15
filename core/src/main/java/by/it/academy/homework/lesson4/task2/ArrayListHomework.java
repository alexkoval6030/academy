package by.it.academy.homework.lesson4.task2;

import by.it.academy.homework.lesson4.task3.ArrayIterator;

import java.util.Iterator;

public class ArrayListHomework<T> {
	private T[] items;
	private int size;

	@SuppressWarnings("unchecked")
	public ArrayListHomework() {
		items = (T[]) new Object[16];
	}

	@SuppressWarnings("unchecked")
	public ArrayListHomework(int arraySize) {
		items = (T[]) new Object[arraySize];
	}

	public ArrayListHomework(T[] items) {
		this.items = items;
		size = items.length;
	}

	public void add(T item) {
		if (size >= items.length) {
			growth();
		}
		items[size++] = item;
	}

	@SuppressWarnings("unchecked")
	private void growth() {
		T[] temp = (T[]) new Object[2 * items.length + 1];
		System.arraycopy(items, 0, temp, 0, items.length);
		items = temp;
	}

	public T get(int index) {
		if (index >= size || index < 0) {
			System.out.println("Array index out of bounds");
			return null;
		} else {
			return items[index];
		}
	}

	public T getLast() {
		if (items[size - 1].equals(null)) {
			System.out.println("Empty array");
			return null;
		} else {
			return items[size - 1];
		}
	}

	public T getFirst() {
		if (items[0].equals(null)) {
			System.out.println("Empty array");
			return null;
		} else {
			return items[0];
		}
	}

	public int arraySize() {
		return items.length;
	}

	public int indexOfTheLastFilledArrayElement() {
		return size - 1;
	}

	public void remove(int index) {
		if (index >= size || index < 0) {
			System.out.println("Array index out of bounds");
			return;
		}
		if (index < size) {
			System.arraycopy(items, index + 1, items, index, size - index - 1);
		}
		items[--size] = null;
	}

	public void remove(T object) {
		for (int i = 0; i < size; i++) {
			if (object.equals(items[i])) {
				if (i < size) {
					System.arraycopy(items, i + 1, items, i, size - i - 1);
					items[--size] = null;
					return;
				}
			}
		}
	}

	public void set(int index, T item) {
		if (index >= items.length || index < 0) {
			System.out.println("Array index out of bounds");
			return;
		}
		if (index >= size) {
			items[size++] = item;
		} else {
			items[index] = item;
		}
	}

	public T[] getItems() {
		return items;
	}
	
	public Iterator<T> getIterator(){
		return new ArrayIterator<T>(items);
	}
}