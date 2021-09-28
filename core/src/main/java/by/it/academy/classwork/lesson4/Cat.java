package java.by.it.academy.classwork.lesson4;

import java.util.Objects;

public class Cat {
	int age;
	String nickname;
	
	public Cat() {
		super();
		}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, nickname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		return age == other.age && Objects.equals(nickname, other.nickname);
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cat [age=");
		builder.append(age);
		builder.append(", nickname=");
		builder.append(nickname);
		builder.append("]");
		return builder.toString();
	}

}
