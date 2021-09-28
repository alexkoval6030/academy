package java.by.it.academy.classwork.lesson11_07_21;
//������ � ������� 2 �����, ����� �������, �������, ������� ��������������.
import java.util.Scanner;

public class Task1_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������� ��� �����");
		int i = scan.nextInt();
		int j = scan.nextInt();
				
		if(i > j) {
			System.out.println("������� ����� " + i + ", ������� ����� " + j + 
					", ������� �������������� " + (i + j) / 2);
		}
		else {
			System.out.println("������� ����� " + j + ", ������� ����� " + i +
					", ������� �������������� " + (i + j) / 2);
		}

		scan.close();
	}

}

