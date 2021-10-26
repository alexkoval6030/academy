package by.it.academy.extrawork.market.service.impl;

import by.it.academy.extrawork.market.model.Product;
import by.it.academy.extrawork.market.repo.ProductRepo;
import by.it.academy.extrawork.market.repo.impl.ProductRepoImpl;
import by.it.academy.extrawork.market.service.ApplicationInitializer;
import by.it.academy.extrawork.market.tokens.Adult;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import static by.it.academy.extrawork.market.util.ProductClassSearch.find;

public class ProductInitializerImpl implements ApplicationInitializer {
    private final static String PACKAGE_NAME = "by/it/academy/extrawork/market/items";
    private final ProductRepo productRepo = ProductRepoImpl.getInstance();

    @Override
    public void init() {
        List<Class<?>> classes = find(PACKAGE_NAME);
        List<Product> products = buildProducts(classes);
        productRepo.getProducts().addAll(products);
    }

    private static List<Product> buildProducts(List<Class<?>> classes) {
        List<Product> products = new ArrayList<>();
        for (Class<?> classProduct : classes) {
            Product product = new Product();
            product.setName(classProduct.getSimpleName());
            Class<?>[] classProductInterfaces = classProduct.getInterfaces();
            if (classProductInterfaces.length != 0) {
                for (Class<?> classProductInterface : classProductInterfaces) {
                    if (classProductInterface.getSimpleName().equals("SubscribedUserAccess")) {
                        product.setSubscribed(true);
                    }
                }
            }
            Annotation[] classProductAnnotations = classProduct.getAnnotations();
            if (classProductAnnotations.length != 0) {
                for (Annotation classProductAnnotation : classProductAnnotations) {
                    if (classProductAnnotation.annotationType().getSimpleName().equals("Adult")) {
                        product.setMinAge(classProduct.getAnnotation(Adult.class).age());
                    }
                }
            }
            products.add(product);
        }
        System.out.println("Products successfully initialized");
        return products;
    }
}