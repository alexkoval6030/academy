package by.academy.homework7;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.LocalDate;

public class ReflectoinDemo {

	public static void main(String[] args) {
		Person person = new Person("Иванов", "Иван", LocalDate.of(1999, 2, 13));
		User user = new User("Петров", "Пётр", LocalDate.of(2012, 11, 5), "Petr2012", "Petr1105@mail.com",
				"qwerty12345");
		Class<? extends Person> personClass = person.getClass();
		Class<? extends User> userClass = user.getClass();

		try {
			System.out.println(userClass.getMethod("printUserInfo"));
//			System.out.println(personClass.getMethod("printUserInfo"));
			System.out.println(userClass.getMethods());
			System.out.println(personClass.getMethods());
			System.out.println(userClass.getField("login"));
			System.out.println(personClass.getField("firstName"));
			System.out.println(userClass.getField("email"));
			System.out.println(personClass.getField("lastName"));
//			System.out.println(userClass.getField("password"));
//			System.out.println(personClass.getField("dateOfBirth"));
			System.out.println(userClass.getFields());
			System.out.println(personClass.getFields());
			System.out.println("----------------------");
			System.out.println(userClass.getDeclaredMethods());
			System.out.println(personClass.getDeclaredMethods());
			System.out.println(userClass.getDeclaredField("login"));
			System.out.println(personClass.getDeclaredField("firstName"));
			System.out.println(userClass.getDeclaredField("email"));
			System.out.println(personClass.getDeclaredField("lastName"));
			System.out.println(userClass.getDeclaredField("password"));
			System.out.println(personClass.getDeclaredField("dateOfBirth"));
			System.out.println(userClass.getDeclaredFields());
			System.out.println(personClass.getDeclaredFields());
			System.out.println("----------------------");
			Field newFieldLogin = userClass.getField("login");
			newFieldLogin.setAccessible(true);
			newFieldLogin.set(user, "Vasia");
			Field newFieldLastNane = personClass.getField("lastName");
			newFieldLastNane.setAccessible(true);
			newFieldLastNane.set(person, "Федя");
			Method method = userClass.getMethod("toString");
			System.out.println(method.invoke(user));
			Method method1 = personClass.getMethod("toString");
			System.out.println(method1.invoke(person));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
}
