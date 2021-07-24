package by.academy.classwork.lesson4;

import java.util.Objects;

public class Vehicle extends Product {
	protected String color;
	protected double engineDisplacement;

	@Override
	protected double discount() {
		if (engineDisplacement > 2.0) {
			return 0.15;
		}
		return 0;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getEngineDisplacement() {
		return engineDisplacement;
	}

	public void setEngineDisplacement(double engineDisplacement) {
		this.engineDisplacement = engineDisplacement;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(color, engineDisplacement);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return Objects.equals(color, other.color)
				&& Double.doubleToLongBits(engineDisplacement) == Double.doubleToLongBits(other.engineDisplacement);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vehicle [color=");
		builder.append(color);
		builder.append(", engineDisplacement=");
		builder.append(engineDisplacement);
		builder.append("]");
		return builder.toString();
	}

}
