package by.it.academy.homework.lesson3;

import by.it.academy.homework.lesson3.classesParticipatingInDeal.AbstractProduct;
import by.it.academy.homework.lesson3.classesParticipatingInDeal.User;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Deal {
    protected AbstractProduct[] abstractProducts;
    protected User seller;
    protected User bayer;
    protected LocalDate dealDate;
    protected LocalDate deadlineDate;

    public Deal(AbstractProduct[] abstractProducts, User seller, User bayer, LocalDate dealDate) {
        this.abstractProducts = abstractProducts;
        this.seller = seller;
        this.bayer = bayer;
        this.dealDate = dealDate;
        this.deadlineDate = dealDate.plusDays(10);
    }

    public double calcFullPrice() {
        double calcFullPrice = 0;
        for (int i = 0; i < abstractProducts.length; i++) {
            calcFullPrice += abstractProducts[i].calcPrice();
        }
        return calcFullPrice;
    }

    public void deleteProduct(String name) {
        int newArraySize = 0;
        for (int i = 0; i < abstractProducts.length; i++) {
            if (abstractProducts[i].getName() == name) {
                newArraySize++;
                abstractProducts[i] = null;
            }
        }
        if (newArraySize != 0) {
            AbstractProduct[] deleteAbstractProduct = new AbstractProduct[abstractProducts.length - newArraySize];
            int k = 0;
            for (int i = 0; i < abstractProducts.length; i++) {
                if (abstractProducts[i] != null) {
                    deleteAbstractProduct[k] = abstractProducts[i];
                    k++;
                }
            }
            abstractProducts = deleteAbstractProduct;
        }
    }

    public void addProduct(AbstractProduct abstractProduct) {
        for (int i = 0; i < abstractProducts.length; i++) {
            if (abstractProducts[i].equals(abstractProduct)) {
                abstractProducts[i].setQuantity(abstractProducts[i].getQuantity() + abstractProduct.getQuantity());
                return;
            }
        }
        AbstractProduct[] addAbstractProduct = Arrays.copyOf(abstractProducts, abstractProducts.length + 1);
        addAbstractProduct[addAbstractProduct.length - 1] = abstractProduct;
        abstractProducts = addAbstractProduct;
    }

    public void setProducts(AbstractProduct[] abstractProducts) {
        this.abstractProducts = abstractProducts;
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
        result = prime * result + Arrays.hashCode(abstractProducts);
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
                && Objects.equals(dealDate, other.dealDate) && Arrays.equals(abstractProducts, other.abstractProducts)
                && Objects.equals(seller, other.seller);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Deal [products=");
        builder.append(Arrays.toString(abstractProducts));
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