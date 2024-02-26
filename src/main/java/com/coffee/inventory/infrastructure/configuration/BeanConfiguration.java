package com.coffee.inventory.infrastructure.configuration;

import com.coffee.inventory.domain.api.IInventoryServicePort;
import com.coffee.inventory.domain.api.IProductServicePort;
import com.coffee.inventory.domain.spi.IInventoryPersistentecePort;
import com.coffee.inventory.domain.spi.IProductPersistencePort;
import com.coffee.inventory.domain.usecase.InventoryUseCase;
import com.coffee.inventory.domain.usecase.ProductUseCase;
import com.coffee.inventory.infrastructure.out.jpa.adapter.InventoryAdapter;
import com.coffee.inventory.infrastructure.out.jpa.adapter.ProductAdapter;
import com.coffee.inventory.infrastructure.out.jpa.repository.IInventoryRepository;
import com.coffee.inventory.infrastructure.out.jpa.repository.IProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    private final IProductRepository productRepository;
    private final IInventoryRepository inventoryRepository;

    @Bean
    public IProductPersistencePort productPersistencePort() {
        return new ProductAdapter(productRepository);
    }
    @Bean
    public IInventoryPersistentecePort inventoryPersistencePort() {
        return new InventoryAdapter(inventoryRepository);
    }

    @Bean
    public IInventoryServicePort inventoryServicePort() {
        return new InventoryUseCase(inventoryPersistencePort());
    }

    @Bean
    public IProductServicePort productServicePort() {
        return new ProductUseCase(productPersistencePort());
    }
}
