package com.coffee.inventory.infrastructure.out.jpa.repository;

import com.coffee.inventory.infrastructure.out.jpa.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Long> {
}
