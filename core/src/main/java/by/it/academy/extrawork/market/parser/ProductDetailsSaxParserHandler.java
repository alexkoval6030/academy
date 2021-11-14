package by.it.academy.extrawork.market.parser;

import by.it.academy.extrawork.market.model.ProductDetails;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import java.util.HashMap;
import java.util.Map;

public class ProductDetailsSaxParserHandler extends DefaultHandler {
    private static final String TAG_PRODUCT = "product";
    private static final String TAG_QUANTITY = "quantityInStorage";
    private static final String TAG_PRICE = "price";
    private static final String TAG_STOCK = "stockRatio";
    private static final String TAG_MIN_STOCK = "minimumStock";

    private String name;
    private int quantity;
    private double price;
    private int stock;
    private int minStock;
    private String currentTagName;
    private Attributes currentAttributes;
    private Map<String, ProductDetails> productDetailsByName = new HashMap<>();

    public Map<String, ProductDetails> getProductDetailsByName() {
        return productDetailsByName;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        currentTagName = qName;
        currentAttributes = attributes;
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName != null) {
            if (qName.equals(TAG_PRODUCT)) {
                ProductDetails productDetails = new ProductDetails(quantity, price, stock, minStock);
                productDetailsByName.put(name, productDetails);
            }
        }
        currentTagName = null;
        currentAttributes = null;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (currentTagName == null) {
            return;
        }
        String stringValue = new String(ch, start, length);

        switch (currentTagName) {
            case TAG_PRODUCT: {
                name = currentAttributes.getValue(0);
                break;
            }
            case TAG_QUANTITY: {
                quantity = Integer.parseInt(stringValue);
                break;
            }
            case TAG_PRICE: {
                price = Double.parseDouble(stringValue);
                break;
            }
            case TAG_STOCK: {
                stock = Integer.parseInt(stringValue);
                break;
            }
            case TAG_MIN_STOCK: {
                minStock = Integer.parseInt(stringValue);
                break;
            }
        }
    }
}