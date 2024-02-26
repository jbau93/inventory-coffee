package com.coffee.inventory.domain.api;

import com.coffee.inventory.infrastructure.out.jpa.entity.Product;

import java.util.List;

public interface IProductServicePort {
    List<Product> findByInventory(long inventoryId);
}
