package com.coffee.inventory.domain.usecase;

import com.coffee.inventory.domain.api.IProductServicePort;
import com.coffee.inventory.domain.spi.IProductPersistencePort;
import com.coffee.inventory.infrastructure.out.jpa.entity.Product;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ProductUseCase implements IProductServicePort {
    private final IProductPersistencePort productPersistencePort;
    @Override
    public List<Product> findByInventory(long inventoryId) {
        return null;
    }
}
