package com.themaj.shopsphereproductservice.repository;

import com.themaj.shopsphereproductservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
