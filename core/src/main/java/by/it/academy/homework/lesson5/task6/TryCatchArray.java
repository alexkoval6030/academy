package by.it.academy.homework.lesson5.task6;

public class TryCatchArray {
	public static void main(String[] args) {
		try {
			int[] array = new int[8];
			for (int i = 0; i < 10; i++) {
				array[i] = i;
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array is to small, expand the array");
		}
	}
}