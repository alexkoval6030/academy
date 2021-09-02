package by.academy.classwork.lesson18;

public class Cat {
	
	public String name;
	protected int age;
	private String colorEye;
	
	
	public Cat() {
		
	}

	public void run() {
		System.out.println("Run");
	}
	
	protected void eat() {
		System.out.println("Eat");
	}
	
	private void sleep() {
		System.out.println("Sleep");
	}

}
