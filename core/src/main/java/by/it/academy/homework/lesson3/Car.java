package by.it.academy.homework.lesson3;

import java.util.Objects;


public class Car extends Product {
    String modelOfCar;
    int numberOfPassenger;


    public Car(String name, double price, int quantity, String modelOfCar, int numberOfPassenger) {
        super(name, price, quantity);
        this.modelOfCar = modelOfCar;
        this.numberOfPassenger = numberOfPassenger;
    }

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
        return "Car [modelOfCar=" + modelOfCar + ", numberOfPassenger=" + numberOfPassenger + "]";
    }
}
