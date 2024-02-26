package com.coffee.inventory.application.handler;

import com.coffee.inventory.application.dto.InventoryResponse;
import com.coffee.inventory.application.dto.ProductResponse;
import com.coffee.inventory.domain.api.IInventoryServicePort;
import com.coffee.inventory.domain.api.IProductServicePort;
import com.coffee.inventory.infrastructure.out.jpa.entity.Inventory;
import com.coffee.inventory.infrastructure.out.jpa.entity.Product;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class InventoryHandler implements IInventoryHandler {
    private final IInventoryServicePort inventoryServicePort;
    private final IProductServicePort productServicePort;
    private final ObjectMapper objectMapper;
    @Override
    public InventoryResponse get() {
        Inventory inventory = inventoryServicePort.get();
        List<Product> products = productServicePort.findByInventory(inventory.getId());

        List<ProductResponse> productResponses = products.stream()
                .map(product -> objectMapper.convertValue(product, ProductResponse.class))
                .toList();

        InventoryResponse inventoryResponse = objectMapper.convertValue(inventory, InventoryResponse.class);

        inventoryResponse.setProducts(productResponses);

        return inventoryResponse;
    }
}
