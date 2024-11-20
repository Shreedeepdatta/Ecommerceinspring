package com.ecommerce.project.repo;

import com.ecommerce.project.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
