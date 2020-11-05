package org.springframework.boot.product.repos;

import org.springframework.boot.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
