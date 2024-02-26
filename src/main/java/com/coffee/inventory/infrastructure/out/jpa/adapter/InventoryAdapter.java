package com.coffee.inventory.infrastructure.out.jpa.adapter;

import com.coffee.inventory.domain.spi.IInventoryPersistentecePort;
import com.coffee.inventory.infrastructure.out.jpa.entity.Inventory;
import com.coffee.inventory.infrastructure.out.jpa.repository.IInventoryRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class InventoryAdapter implements IInventoryPersistentecePort {
    private final IInventoryRepository inventoryRepository;
    @Override
    public Inventory get() {
        return inventoryRepository.findAll().get(0);
    }
}
