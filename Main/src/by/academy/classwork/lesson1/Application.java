package by.academy.classwork.lesson1;

public class Application {

	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat("Мурзик");
		
		cat2.eat();
		cat2.sleep();
		cat2.walk();
        
		for (int i = 0; i < 3; i++) {
            cat1.grow();
        }
		
		System.out.println("Возраст " + cat1.nickname + " равен " + cat1.getAge());
	}

}
