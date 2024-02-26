package com.coffee.inventory.domain.spi;

import com.coffee.inventory.infrastructure.out.jpa.entity.Inventory;

public interface IInventoryPersistentecePort {
    Inventory get();
}
