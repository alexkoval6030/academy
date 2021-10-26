package by.it.academy.extrawork.market.detais.impl;

import by.it.academy.extrawork.market.detais.Details;
import by.it.academy.extrawork.market.model.ProductDetails;
import java.util.ArrayList;
import java.util.List;

public class DetailsImpl implements Details {
    List<ProductDetails> productDetails = new ArrayList<>();
    private static final Details INSTANCE = new DetailsImpl();

    @Override
    public List<ProductDetails> getProductDetails() {
        return productDetails;
    }

    private DetailsImpl() {
    }

    public static Details getInstance() {
        return INSTANCE;
    }
}