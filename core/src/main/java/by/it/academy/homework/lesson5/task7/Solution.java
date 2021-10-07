package by.it.academy.homework.lesson5.task7;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

	static class DoublyLinkedListNode {
		public int data;
		public DoublyLinkedListNode next;
		public DoublyLinkedListNode prev;

		public DoublyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
			this.prev = null;
		}
	}

	static class DoublyLinkedList {
		public DoublyLinkedListNode head;
		public DoublyLinkedListNode tail;

		public DoublyLinkedList() {
			this.head = null;
			this.tail = null;
		}

		public void insertNode(int nodeData) {
			DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);
			if (this.head == null) {
				this.head = node;
			} else {
				this.tail.next = node;
				node.prev = this.tail;
			}
			this.tail = node;
		}
	}

	public static void printDoublyLinkedList(DoublyLinkedListNode node, String sep) {
		while (node != null) {
			System.out.print(node.data);
			node = node.next;
			if (node != null) {
				System.out.print(sep);
			}
		}
	}

	public static DoublyLinkedListNode reverse(DoublyLinkedList list) {
		if (list.head == null || list.head.next == null)
			return list.head;

		DoublyLinkedListNode currentNode = list.head;
		DoublyLinkedListNode nextNode = currentNode.next;

		while (currentNode != null) {
			currentNode.next = currentNode.prev;
			currentNode.prev = nextNode;

			currentNode = nextNode;
		}
		return currentNode;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		DoublyLinkedList list = new DoublyLinkedList();

		System.out.println("введите число");
		int listCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < listCount; i++) {
			System.out.println("введите цифру");
			int listItem = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			list.insertNode(listItem);
		}
		DoublyLinkedListNode list1 = reverse(list);

		printDoublyLinkedList(list1, " ");
		scanner.close();
	}
}