package by.academy.classwork.lesson4;

import java.util.Objects;

public class Motorcycle extends Product {
	protected String color;
	protected double engineDisplacement;
	
	public Motorcycle() {
		super();
	}
	
	public Motorcycle(String name, double price, int quantity, String color, double engineDisplacement) {
		super(name, price, quantity);
		this.color = color;
		this.engineDisplacement = engineDisplacement;
	}

	@Override
	protected double discount() {
		if (engineDisplacement > 1.0) {
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
		Motorcycle other = (Motorcycle) obj;
		return Objects.equals(color, other.color)
				&& Double.doubleToLongBits(engineDisplacement) == Double.doubleToLongBits(other.engineDisplacement);
	}

	@Override
	public String toString() {
		return "Motorcycle [color=" + color + ", engineDisplacement=" + engineDisplacement + "]";
	}

	

}
