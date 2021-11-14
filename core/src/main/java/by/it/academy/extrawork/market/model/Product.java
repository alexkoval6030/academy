package by.it.academy.extrawork.market.model;

import java.util.Objects;

public class Product {
    private String name;
    private boolean isSubscribed;
    private Integer minAge;
    private ProductDetails productDetails;

    public Product() {
    }

    public Product(String name, boolean isSubscribed, Integer minAge, ProductDetails productDetails) {
        this.name = name;
        this.isSubscribed = isSubscribed;
        this.minAge = minAge;
        this.productDetails = productDetails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSubscribed() {
        return isSubscribed;
    }

    public void setSubscribed(boolean subscribed) {
        isSubscribed = subscribed;
    }

    public Integer getMinAge() {
        return minAge;
    }

    public void setMinAge(Integer minAge) {
        this.minAge = minAge;
    }

    public ProductDetails getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(ProductDetails productDetails) {
        this.productDetails = productDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return isSubscribed == product.isSubscribed && Objects.equals(name, product.name) && Objects.equals(minAge, product.minAge) && Objects.equals(productDetails, product.productDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isSubscribed, minAge, productDetails);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", isSubscribed=" + isSubscribed +
                ", minAge=" + minAge +
                ", productDetails=" + productDetails +
                '}';
    }
}