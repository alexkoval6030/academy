package by.academy.classwork.deal;

import java.time.LocalDate;

public class AplicationDeal {

	public static void main(String[] args) {
		User seller = new User("Mihail", 0.0);
		User bayer = new User("Denis", 1.0);
		Product[] products = new Product[3];
		products[0] = new Car("Honda", 8000.0, 1, "accord", 5);
		products[1] = new Motorcycle("Harley-Davidson", 10000.0, 1, "Black", 1.8);
		products[2] = new Car("Audi", 5000.0, 1, "100", 5);
		
		
		Deal deal = new Deal(products, seller, bayer, LocalDate.now());
				
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
