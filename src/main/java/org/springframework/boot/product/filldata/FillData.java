package org.springframework.boot.product.filldata;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.product.Product;
import org.springframework.boot.product.repos.ProductRepo;
import org.springframework.stereotype.Component;

@Component
public class FillData implements CommandLineRunner {

    private final ProductRepo productRepo;

    public FillData(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Filling product data");

        Product bir = new Product();
        bir.setName("paper");
        productRepo.save(bir);

        Product iki = new Product();
        iki.setName("post-it");
        productRepo.save(iki);

        Product uc = new Product();
        uc.setName("card");
        productRepo.save(uc);

        System.out.println(productRepo.count() + " data saved");
    }
}
