package by.academy.classwork.deal;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Deal {
	protected Product[] products;
	protected User seller;
	protected User bayer;
	protected LocalDate dealDate;
	protected LocalDate deadlineDate;

	public Deal(Product[] products, User seller, User bayer, LocalDate dealDate) {
		this.products = products;
		this.seller = seller;
		this.bayer = bayer;
		this.dealDate = dealDate;
		this.deadlineDate = dealDate.plusDays(10);
	}

	public double calcFullPrice() {
		double calcFullPrice = 0;
		for (int i = 0; i < products.length; i++) {
			calcFullPrice += products[i].calcPrice();
		}
		return calcFullPrice;
	}

	public void deleteProduct(String name) {
		int newArraySize = 0;
		for (int i = 0; i < products.length; i++) {
			if (products[i].getName() == name) {
				newArraySize++;
				products[i] = null;
			}
		}
		if (newArraySize != 0) {
			Product[] deleteProduct = new Product[products.length - newArraySize];
			int k = 0;

			for (int i = 0; i < products.length; i++) {
				if (products[i] != null) {
					deleteProduct[k] = products[i];
					k++;
				}
			}

			products = deleteProduct;
		}
	}

	public void addProduct(Product product) {
		for (int i = 0; i < products.length; i++) {
			if (products[i].equals(product)) {
				products[i].setQuantity(products[i].getQuantity() + product.getQuantity());
				return;
			}
		}

		Product[] addProduct = Arrays.copyOf(products, products.length + 1);
		addProduct[addProduct.length - 1] = product;

		products = addProduct;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public User getSeller() {
		return seller;
	}

	public void setSeller(User seller) {
		this.seller = seller;
	}

	public User getBayer() {
		return bayer;
	}

	public void setBayer(User bayer) {
		this.bayer = bayer;
	}

	public LocalDate getDealDate() {
		return dealDate;
	}

	public void setDealDate(LocalDate dealDate) {
		this.dealDate = dealDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(products);
		result = prime * result + Objects.hash(bayer, deadlineDate, dealDate, seller);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deal other = (Deal) obj;
		return Objects.equals(bayer, other.bayer) && Objects.equals(deadlineDate, other.deadlineDate)
				&& Objects.equals(dealDate, other.dealDate) && Arrays.equals(products, other.products)
				&& Objects.equals(seller, other.seller);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Deal [products=");
		builder.append(Arrays.toString(products));
		builder.append(", seller=");
		builder.append(seller);
		builder.append(", bayer=");
		builder.append(bayer);
		builder.append(", dealDate=");
		builder.append(dealDate);
		builder.append(", deadlineDate=");
		builder.append(deadlineDate);
		builder.append("]");
		return builder.toString();
	}
}
