package Animal;

public class Animal {
	
	int age = 1;
	String nickname = "NoName";
	
	public int getAge () {
		return age;
	}
	
	public void setAge (int age) {
		this.age = age;
	}

	public String getNickname () {
		return nickname;
	}
	
	public void setNickname (String nickname) {
		this.nickname = nickname;
	}
	
	public Animal () {}
	
	public Animal (int i) {
		age = i;
	}
	
	public Animal (String n) {
		nickname = n;
	}
	
	public Animal (int i,String n) {
		age = i;
		nickname = n;
	}
}