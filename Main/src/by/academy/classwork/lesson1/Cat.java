package by.academy.classwork.lesson1;

public class Cat {
	int age;
	String nickname;
	
	public void grow() {
		age++;
	}
	
	public int getAge() {
		return age;
	}
	
	public void sleep() {
		System.out.println("��� ����");
	}
	
	public void eat() {
		System.out.println("��� ���");
	}
	
	public void walk() {
		System.out.println("��� ������");
	}
	
	public Cat() {
		
	}
	
	public Cat(String nickname) {
		this.nickname = nickname;
	}

}
