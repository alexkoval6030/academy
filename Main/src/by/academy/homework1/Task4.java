package by.academy.homework1;

public class Task4 {

	public static void main(String[] args) {
		int i = 1;
		int j = 2;
		
		while (j < 1_000_000) {
			System.out.println(i);
			j = j * 2;
			i++;
		}
		
	}

}
