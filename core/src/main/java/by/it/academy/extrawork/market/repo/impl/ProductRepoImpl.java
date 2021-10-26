package by.it.academy.extrawork.market.repo.impl;

import by.it.academy.extrawork.market.model.Product;
import by.it.academy.extrawork.market.repo.ProductRepo;
import java.util.ArrayList;
import java.util.List;

public class ProductRepoImpl implements ProductRepo {
    private List<Product> products = new ArrayList<>();
    private static final ProductRepo INSTANCE = new ProductRepoImpl();

    @Override
    public List<Product> getProducts() {
        return products;
    }

    private ProductRepoImpl(){
    }

    public static ProductRepo getInstance(){
        return INSTANCE;
    }
}