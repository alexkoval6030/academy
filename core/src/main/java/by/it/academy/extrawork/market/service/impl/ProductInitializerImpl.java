package by.it.academy.extrawork.market.service.impl;

import by.it.academy.extrawork.market.detais.DetailsRepo;
import by.it.academy.extrawork.market.detais.impl.ProductDetailsRepo;
import by.it.academy.extrawork.market.model.Product;
import by.it.academy.extrawork.market.model.ProductDetails;
import by.it.academy.extrawork.market.repo.ProductRepo;
import by.it.academy.extrawork.market.repo.impl.ProductRepoImpl;
import by.it.academy.extrawork.market.service.ApplicationInitializer;
import by.it.academy.extrawork.market.tokens.Adult;
import by.it.academy.extrawork.market.util.ProductClassSearch;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProductInitializerImpl implements ApplicationInitializer {
    private static final ProductInitializerImpl INSTANCE = new ProductInitializerImpl();
    private final static String PACKAGE_NAME = "by/it/academy/extrawork/market/items";
    private final ProductRepo productRepo = ProductRepoImpl.getInstance();
    private final static String INTERFACE_NAME = "SubscribedUserAccess";
    private final static String ANNOTATION_NAME = "Adult";

    private ProductInitializerImpl(){}

    public static ProductInitializerImpl getInstance(){
        return INSTANCE;
    }

    @Override
    public void init() {
        List<Class<?>> classes = ProductClassSearch.find(PACKAGE_NAME);
        DetailsRepo detailsRepo = ProductDetailsRepo.getInstance();
        Map<String, ProductDetails> repoProductDetails = detailsRepo.getProductDetails();
        List<Product> products = buildProducts(classes, repoProductDetails);
        productRepo.addProduct(products);
        System.out.println("Products successfully initialized. Initialized " + products.size() + " products.");
    }

    private List<Product> buildProducts(List<Class<?>> classes, Map<String, ProductDetails> productDetailsMap) {
        List<Product> products = new ArrayList<>();
        for (Class<?> classProduct : classes) {
            Product product = new Product();
            product.setName(classProduct.getSimpleName());
            Class<?>[] classProductInterfaces = classProduct.getInterfaces();
            for (Class<?> classProductInterface : classProductInterfaces) {
                if (classProductInterface.getSimpleName().equals(INTERFACE_NAME)) {
                    product.setSubscribed(true);
                }
            }
            Annotation[] classProductAnnotations = classProduct.getAnnotations();
            for (Annotation classProductAnnotation : classProductAnnotations) {
                if (classProductAnnotation.annotationType().getSimpleName().equals(ANNOTATION_NAME)) {
                    product.setMinAge(classProduct.getAnnotation(Adult.class).age());
                }
            }
            product.setProductDetails(productDetailsMap.get(product.getName()));
            products.add(product);
        }
        return products;
    }
}