package by.it.academy.homework.lesson3;

import by.it.academy.homework.lesson3.classesParticipatingInDeal.Car;
import by.it.academy.homework.lesson3.classesParticipatingInDeal.Motorcycle;
import by.it.academy.homework.lesson3.classesParticipatingInDeal.AbstractProduct;
import by.it.academy.homework.lesson3.classesParticipatingInDeal.User;

import java.time.LocalDate;

public class ApplicationDeal {
    public static void main(String[] args) {
        User seller = new User("Mihail", 0.0);
        User bayer = new User("Denis", 1.0);
        AbstractProduct[] abstractProducts = new AbstractProduct[3];

        abstractProducts[0] = new Car("Honda", 8000.0, 1, "accord", 5);
        abstractProducts[1] = new Motorcycle("Harley-Davidson", 10000.0, 1, "Black", 1.8);
        abstractProducts[2] = new Car("Audi", 5000.0, 1, "100", 5);

        Deal deal = new Deal(abstractProducts, seller, bayer, LocalDate.now());
        System.out.println(deal);
        System.out.println(deal.calcFullPrice());
        deal.deleteProduct("Audi");
        System.out.println(deal);
        System.out.println(deal.calcFullPrice());
        deal.addProduct(new Car("BMW", 20000.0, 1, "X5", 5));
        System.out.println(deal);
        System.out.println(deal.calcFullPrice());
    }
}