package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @Autowired ProductRepository productRepository;

    @RequestMapping("/products")
    public @ResponseBody Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }
//
    @GetMapping("/products/category/{category}")
    public Iterable<Product> getProductsByCategory(@PathVariable String category) {
        return productRepository.findByCategory(category);
    }

    @GetMapping("products/supplier/{supplier}")
    public Iterable<Product> getProductsBySupplier(@PathVariable String supplier) {
        return productRepository.findBySupplier(supplier);
    }

    @GetMapping("products/{category}/{supplier}")
    public Iterable<Product> getProductsByCategoryAndSupplier(@PathVariable String category,
                                                              @PathVariable String supplier) {
        return productRepository.findByCategoryAndSupplier(category,supplier);
    }
}