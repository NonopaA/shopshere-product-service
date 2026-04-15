package com.themaj.shopsphereproductservice.controller;

import com.themaj.shopsphereproductservice.model.Product;
import com.themaj.shopsphereproductservice.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping
    public List<Product> findAllProducts() {
        return productService.getAllProducts();    }
    @GetMapping("/{id}")
    public Optional<Product> findProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }
    @PostMapping
    public Product saveProducts(@RequestBody Product product) {
        return productService.saveProduct(product);
    }
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
    @DeleteMapping("/all")
    public void deleteAllProducts() {
        productService.deleteProducts();
    }

}
