package com.coffee.inventory.domain.usecase;

import com.coffee.inventory.domain.api.IInventoryServicePort;
import com.coffee.inventory.domain.spi.IInventoryPersistentecePort;
import com.coffee.inventory.infrastructure.out.jpa.entity.Inventory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class InventoryUseCase implements IInventoryServicePort {
    private final IInventoryPersistentecePort inventoryPersistencePort;
    @Override
    public Inventory get() {
        return inventoryPersistencePort.get();
    }
}
