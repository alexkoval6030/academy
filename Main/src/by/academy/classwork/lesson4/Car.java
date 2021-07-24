package by.academy.classwork.lesson4;

import java.util.Objects;

public class Car extends Vehicle {
	String modelOfCar;
	int numberOfPassenger;

	@Override
	public double discount() {
		if (numberOfPassenger > 2) {
			return 0.2;
		}
		return 0;
	}

	public String getModelOfCar() {
		return modelOfCar;
	}

	public void setModelOfCar(String modelOfCar) {
		this.modelOfCar = modelOfCar;
	}

	public int getNumberOfPassenger() {
		return numberOfPassenger;
	}

	public void setNumberOfPassenger(int numberOfPassenger) {
		this.numberOfPassenger = numberOfPassenger;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(modelOfCar, numberOfPassenger);
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
		Car other = (Car) obj;
		return Objects.equals(modelOfCar, other.modelOfCar) && numberOfPassenger == other.numberOfPassenger;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [modelOfCar=");
		builder.append(modelOfCar);
		builder.append(", numberOfPassenger=");
		builder.append(numberOfPassenger);
		builder.append("]");
		return builder.toString();
	}

}
