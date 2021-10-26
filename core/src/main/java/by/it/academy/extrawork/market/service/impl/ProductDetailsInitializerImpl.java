package by.it.academy.extrawork.market.service.impl;

import by.it.academy.extrawork.market.detais.Details;
import by.it.academy.extrawork.market.detais.impl.DetailsImpl;
import by.it.academy.extrawork.market.model.ProductDetails;
import by.it.academy.extrawork.market.parser.SaxParserHandler;
import by.it.academy.extrawork.market.service.ApplicationInitializer;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class ProductDetailsInitializerImpl implements ApplicationInitializer {
    private static final String FILE_NAME = "core/src/main/java/by/it/academy/extrawork/market/Parser/ProductDetailsFile.xml";
    Details details = DetailsImpl.getInstance();

    @Override
    public void init() {
        ProductDetailsInitializerImpl productDetailsInitializer = new ProductDetailsInitializerImpl();
        List<ProductDetails> productDetailsList = productDetailsInitializer.parse();
        details.getProductDetails().addAll(productDetailsList);
    }

    public List<ProductDetails> parse() {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SaxParserHandler saxParserHandler = new SaxParserHandler();
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
        System.out.println("Products details successfully initialized");
        return saxParserHandler.getProductDetailsList();
    }
}
