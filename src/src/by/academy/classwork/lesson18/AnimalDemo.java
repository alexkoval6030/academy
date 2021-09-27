package by.academy.classwork.lesson18;

import java.lang.reflect.Method;

public class AnimalDemo {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Tiger tiger = new Tiger();
		
		Class<? extends Cat> catClass = cat.getClass();
		Method[] getMetodCat;
		try {
			getMetodCat = catClass.getDeclaredMethods();
			for (Method method : getMetodCat) {
				System.out.println(method);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}

		Class<? extends Tiger> tigerClass = tiger.getClass();
		Method[] getMetodTiger;
		try {
			getMetodTiger = tigerClass.getDeclaredMethods();
			for (Method method : getMetodTiger) {
				System.out.println(method);
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
