package app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    MockedProducts prodList = new MockedProducts();

    @RequestMapping("/products")
    public List<Product> getAllProducts() {
        return prodList.fetchProducts();
    }

    @GetMapping("/products/{category}")
    public List<Product> getProductName(@PathVariable String category) {
        return prodList.searchProducts(category);
    }

}