package by.it.academy.extrawork.market.service.impl;

import by.it.academy.extrawork.market.detais.DetailsRepo;
import by.it.academy.extrawork.market.detais.impl.ProductDetailsRepo;
import by.it.academy.extrawork.market.model.ProductDetails;
import by.it.academy.extrawork.market.parser.ProductDetailsSaxParserHandler;
import by.it.academy.extrawork.market.service.ApplicationInitializer;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.Map;

public class ProductDetailsInitializerImpl implements ApplicationInitializer {
    private static final String FILE_NAME = "core/src/main/java/by/it/academy/extrawork/market/Parser/ProductDetailsFile.xml";
    DetailsRepo details = ProductDetailsRepo.getInstance();

    @Override
    public void init() {
        Map<String, ProductDetails> productDetailsMap = parse();
        details.putProductDetails(productDetailsMap);
        System.out.println("Products details successfully initialized");
    }

    public Map<String, ProductDetails> parse() {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        ProductDetailsSaxParserHandler saxParserHandler = new ProductDetailsSaxParserHandler();
        SAXParser saxParser = null;
        try {
            saxParser = saxParserFactory.newSAXParser();
        } catch (ParserConfigurationException | SAXException e) {
            e.printStackTrace();
        }
        File file = new File(FILE_NAME);
        try {
            saxParser.parse(file, saxParserHandler);
        } catch (SAXException | IOException e) {
            e.printStackTrace();
        }
        return saxParserHandler.getProductDetailsByName();
    }
}