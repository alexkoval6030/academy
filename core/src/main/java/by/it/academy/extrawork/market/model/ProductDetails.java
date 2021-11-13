package by.it.academy.extrawork.market.model;

import java.util.Objects;

public class ProductDetails {
    private String name;
    private int quantityInStorage;
    private double price;
    private int stockRatio;
    private int minimumStock;
    private int expectedArrival;

    public ProductDetails() {
    }

    public ProductDetails(int quantityInStorage, double price, int stockRatio, int minimumStock) {
        this.quantityInStorage = quantityInStorage;
        this.price = price;
        this.stockRatio = stockRatio;
        this.minimumStock = minimumStock;
        this.expectedArrival = stockRatio - quantityInStorage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityInStorage() {
        return quantityInStorage;
    }

    public void setQuantityInStorage(int quantityInStorage) {
        this.quantityInStorage = quantityInStorage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockRatio() {
        return stockRatio;
    }

    public void setStockRatio(int stockRatio) {
        this.stockRatio = stockRatio;
    }

    public int getMinimumStock() {
        return minimumStock;
    }

    public void setMinimumStock(int minimumStock) {
        this.minimumStock = minimumStock;
    }

    public int getExpectedArrival() {
        return expectedArrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDetails that = (ProductDetails) o;
        return quantityInStorage == that.quantityInStorage && Double.compare(that.price, price) == 0 && stockRatio == that.stockRatio && minimumStock == that.minimumStock && expectedArrival == that.expectedArrival && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, quantityInStorage, price, stockRatio, minimumStock, expectedArrival);
    }

    @Override
    public String toString() {
        return "ProductDetails{" +
                "name='" + name + '\'' +
                ", quantityInStorage=" + quantityInStorage +
                ", price=" + price +
                ", stockRatio=" + stockRatio +
                ", minimumStock=" + minimumStock +
                ", expectedArrival=" + expectedArrival +
                '}';
    }
}