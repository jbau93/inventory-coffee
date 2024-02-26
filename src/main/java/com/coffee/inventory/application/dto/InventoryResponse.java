package com.coffee.inventory.application.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class InventoryResponse {
    List<ProductResponse> products;
}
