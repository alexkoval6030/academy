package by.classwork10;

public class CustomLinkedList<T> {

	private Node<T> head;
	private Node<T> tail;

	private Integer size = 0;

	public void add(T items) {

	}

	public void remove(int index) {

	}
	
	public void set(int index, T items) {

	}
	
	public T get(int index) {
		return null;
	}

	class Node<T> {
		Node<T> next;
		Node<T> prev;
		T value;

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Node [next=");
			builder.append(next);
			builder.append(", prev=");
			builder.append(prev);
			builder.append(", value=");
			builder.append(value);
			builder.append("]");
			return builder.toString();
		}

	}

}
