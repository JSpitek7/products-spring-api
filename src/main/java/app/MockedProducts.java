package app;

import java.util.ArrayList;
import java.util.List;

public class MockedProducts {
    public List<Product> products;

    public MockedProducts() {
        products = new ArrayList<>();
        products.add(new Product(1, "brake pads", 20.00, "wheels and tires"));
        products.add(new Product(2, "brake rotors", 15.00, "wheels and tires"));
        products.add(new Product(3, "fuel pump",5.00, "fuel system"));
    }

    public List<Product> fetchProducts() {
        return this.products;
    }

    public List<Product> searchProducts(String category) {
        List<Product> searchedProducts;
        searchedProducts = new ArrayList<>();
        for (Product p: products) {
            if (p.getCategory().equals(category)) {
                searchedProducts.add(p);
            }
        }
        return searchedProducts;
    }
}