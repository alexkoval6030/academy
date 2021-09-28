package java.by.it.academy.classwork.lesson11_07_21;

import java.util.Scanner;

public class Task1_3 {
	//�������� �����. ����������, �������� �� ����� ������ ��� �� ������,
	//������� ��������� ���������.
	public static void main(String[] args) {
		System.out.println("������� �����");
		
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		
		if(i % 2 == 0) {
			System.out.println("����� " + i + " ������");
		}
		else {
			System.out.println("����� " + i + " ��������");
		}
		
		scan.close();
	}

}
