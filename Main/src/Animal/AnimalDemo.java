package Animal;

public class AnimalDemo {
	
	public static void main(String...args) {
		Animal animal1 = new Animal();
		animal1.setAge(100);
		animal1.setNickname("Черепашка");
		System.out.println(animal1.getAge());
		System.out.println(animal1.getNickname());	
		Animal cat = new Animal(5);
		System.out.println(cat.age);
		System.out.println(cat.nickname);
		Animal animal3 = new Animal(10,"Vasia");
		System.out.println(animal3.age);
		System.out.println(animal3.nickname);
		Animal animal4 = new Animal("Kolia");
		System.out.println(animal4.age);
		System.out.println(animal4.nickname);
	}
}

