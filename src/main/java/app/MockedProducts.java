package app;

import java.util.ArrayList;
import java.util.List;

public class MockedProducts {
    public List<Product> products;

    private static MockedProducts instance = null;
    public static MockedProducts getInstance(){
        if(instance == null){
            instance = new MockedProducts();
        }
        return instance;
    }

    public MockedProducts() {
        products = new ArrayList<Product>();
        products.add(new Product(1, "weed", 20.00, "herb"));
        products.add(new Product(2, "grinder", 15.00, "herb"));
        products.add(new Product(3, "cheetos",5.00, "munchies"));
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