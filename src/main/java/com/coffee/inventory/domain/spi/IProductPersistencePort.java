package com.coffee.inventory.domain.spi;

import com.coffee.inventory.infrastructure.out.jpa.entity.Product;

import java.util.List;

public interface IProductPersistencePort {
    List<Product> findAll();
}
