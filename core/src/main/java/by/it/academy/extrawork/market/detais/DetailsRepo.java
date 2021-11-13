package by.it.academy.extrawork.market.detais;

import by.it.academy.extrawork.market.model.ProductDetails;
import java.util.Map;

public interface DetailsRepo {
    Map<String, ProductDetails> getProductDetails();
    Map<String, ProductDetails> putProductDetails(Map<String, ProductDetails> productDetailsMap);

}