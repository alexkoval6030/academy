package by.it.academy.homework.lesson3;

import java.util.Objects;

public class User {
	String nameUser;
	double moneyUser;
	
	public User(String nameUser, double moneyUser) {
		this.nameUser = nameUser;
		this.moneyUser = moneyUser;
	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

	public double getMoneyUser() {
		return moneyUser;
	}

	public void setMoneyUser(double moneyUser) {
		this.moneyUser = moneyUser;
	}

	@Override
	public int hashCode() {
		return Objects.hash(moneyUser, nameUser);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Double.doubleToLongBits(moneyUser) == Double.doubleToLongBits(other.moneyUser)
				&& Objects.equals(nameUser, other.nameUser);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [nameUser=");
		builder.append(nameUser);
		builder.append(", moneyUser=");
		builder.append(moneyUser);
		builder.append("]");
		return builder.toString();
	}
}
