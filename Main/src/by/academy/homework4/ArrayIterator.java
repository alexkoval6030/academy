package by.academy.homework4;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator<E> implements Iterator<E> {

	private E[] elements;
	private int index = 0;
	
	public ArrayIterator(E[] elements) {
		this.elements = elements;
	}
	
	@Override
	public boolean hasNext() {
		return index < elements.length;
	}

	@Override
	public E next() {
		if(hasNext() && elements.length > 0) {
			return elements[index++];
		}
		throw new NoSuchElementException();
	}

}
