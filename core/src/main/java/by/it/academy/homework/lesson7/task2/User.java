package by.it.academy.homework.lesson7.task2;

import java.time.LocalDate;

public class User extends Person{
	
	public String login;
	public String email;
	private String password;
	
	public User() {}
	
	public User(String firstName, String lastName, LocalDate dateOfBirth, String login, String email, String password) {
		super(firstName, lastName, dateOfBirth);
		this.login = login;
		this.email = email;
		this.password = password;
	}

	public void printUserInfo() {
		System.out.println("Login " + login);
		System.out.println("Email " + email);
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [login=");
		builder.append(login);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}

}
