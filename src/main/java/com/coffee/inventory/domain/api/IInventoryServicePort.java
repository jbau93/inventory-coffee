package com.coffee.inventory.domain.api;

import com.coffee.inventory.infrastructure.out.jpa.entity.Inventory;

public interface IInventoryServicePort {
    Inventory get();
}
