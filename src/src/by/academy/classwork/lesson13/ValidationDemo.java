package by.academy.classwork.lesson13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationDemo {
	

	private static Pattern pattern = Pattern.compile("[a-zA-Z0-9_]{1,20}");

	
	public static void main(String[] args) {
		String login = "";
		String password = null;
		String confPass = null;
		boolean conf = false;
		try {
			conf = isValid(login, password, confPass);
			System.out.println(conf);
		}catch(WrongLoginException | WrongPasswordException e) {
			System.out.println(e.getMessage());
		}

	}

	public static boolean isValid(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
		if(login == null) {
			throw new WrongLoginException("Поле логин пустой");
		}
		if(password == null) {
			throw new WrongPasswordException("Поле пароль пустой");
		}
		Matcher matchLog = pattern.matcher(login);
		Matcher matchPass = pattern.matcher(password);
		if (!matchLog.matches()) {
			throw new WrongLoginException("Логин должен содержать только латинские буквы ...");
		}
		if (!matchPass.matches()) {
			throw new WrongPasswordException("Пароль должен содержать только латинские буквы ...");
		} else {
			throw new WrongLoginException("Неверный пароль");
		}
	}
}
