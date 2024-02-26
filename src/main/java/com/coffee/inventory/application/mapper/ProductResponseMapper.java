package com.coffee.inventory.application.mapper;

import com.coffee.inventory.application.dto.ProductResponse;
import com.coffee.inventory.infrastructure.out.jpa.entity.Product;

import java.util.List;

public interface ProductResponseMapper {
    List<ProductResponse> toList(List<Product> products);
}
