package by.academy.classwork.lesson4;

public class AplicatinDeal {

	public static void main(String[] args) {
		User seller = new User("Mihail", 1500.0);
		User bayer = new User("Denis", 25000.0);
		Product[] products = new Product[2];
		products[0] = new Car("Honda", 8000.0, 1, "accord", 5);
		products[1] = new Motorcycle("Harley-Davidson", 10000.0, 1, "Black", 1.8);
		
		Deal deal = new Deal();
		
		deal.setProducts(products);
		deal.setBayer(bayer);
		deal.setSeller(seller);
		deal.setDealDate("25.07.21");
		
		System.out.println(deal);
		System.out.println(deal.calcFullPrice());

	}

}
