package com.coffee.inventory.application.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductResponse {
    private Long id;
    private String name;
    private String description;
    private Double  price;
    private String createdAt;
    private String updatedAt;
}
