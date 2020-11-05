package org.springframework.boot.product.service;

import org.springframework.boot.product.Product;
import org.springframework.boot.product.repos.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;

    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public Product findProductById(Long id) {
        return productRepo.findById(id).orElse(null);
    }

    @Override
    public List<Product> findAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product updateProductById(Product product, Long id) {
        Optional<Product> foundProduct = productRepo.findById(id);

        if (!foundProduct.isPresent())
            return null;

        product.setId(id);

        return productRepo.save(product);
    }

    @Override
    public void deleteProductById(Long id) {
        productRepo.deleteById(id);
    }
}
