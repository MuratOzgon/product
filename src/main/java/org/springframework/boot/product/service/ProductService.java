package org.springframework.boot.product.service;

import org.springframework.boot.product.Product;

import java.util.List;

public interface ProductService {

    Product findProductById(Long id);

    List<Product> findAllProducts();

    Product saveProduct(Product product);

    Product updateProductById(Product product, Long id);

    void deleteProductById(Long id);
}
