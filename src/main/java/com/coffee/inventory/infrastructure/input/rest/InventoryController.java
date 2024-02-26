package com.coffee.inventory.infrastructure.input.rest;

import com.coffee.inventory.application.dto.InventoryResponse;
import com.coffee.inventory.application.handler.IInventoryHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/inventory")
public class InventoryController {
    private final IInventoryHandler inventoryHandler;

    public ResponseEntity<InventoryResponse> all() {
        var inventoryResponse = inventoryHandler.get();

        return ResponseEntity.ok(inventoryResponse);
    }
}
