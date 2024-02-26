package com.coffee.inventory.infrastructure.out.jpa.adapter;

import com.coffee.inventory.domain.spi.IProductPersistencePort;
import com.coffee.inventory.infrastructure.out.jpa.entity.Product;
import com.coffee.inventory.infrastructure.out.jpa.repository.IProductRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ProductAdapter implements IProductPersistencePort {
    private final IProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
