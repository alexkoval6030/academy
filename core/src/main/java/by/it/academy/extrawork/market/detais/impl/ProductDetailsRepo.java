package by.it.academy.extrawork.market.detais.impl;

import by.it.academy.extrawork.market.detais.DetailsRepo;
import by.it.academy.extrawork.market.model.ProductDetails;
import java.util.HashMap;
import java.util.Map;

public class ProductDetailsRepo implements DetailsRepo {
    Map<String, ProductDetails> productDetails = new HashMap<>();
    private static final DetailsRepo INSTANCE = new ProductDetailsRepo();

    @Override
    public Map<String, ProductDetails> getProductDetails() {
        return productDetails;
    }

    @Override
    public Map<String, ProductDetails> putProductDetails(Map<String, ProductDetails> productDetailsMap) {
        productDetails.putAll(productDetailsMap);
        return productDetails;
    }

    private ProductDetailsRepo() {
    }

    public static DetailsRepo getInstance() {
        return INSTANCE;
    }
}