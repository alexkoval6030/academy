package by.it.academy.homework.lesson5.task3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorTwoDimensionalArray<E> implements Iterator<E> {

    private E[][] elements;
    private int stringIndex = 0;
    private int columnIndex = 0;

    public IteratorTwoDimensionalArray(E[][] elements) {
        this.elements = elements;
    }

    @Override
    public boolean hasNext() {
        return columnIndex < elements.length && stringIndex < elements[columnIndex].length;
    }

    @Override
    public E next() {
        if (hasNext() && elements.length > 0 && elements[columnIndex].length > 0) {
            E next = elements[columnIndex][stringIndex++];
            if (stringIndex == elements[columnIndex].length) {
                stringIndex = 0;
                columnIndex++;
            }
            return next;
        }
        throw new NoSuchElementException();
    }
}
