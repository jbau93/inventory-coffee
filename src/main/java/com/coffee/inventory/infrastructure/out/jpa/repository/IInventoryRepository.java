package com.coffee.inventory.infrastructure.out.jpa.repository;

import com.coffee.inventory.infrastructure.out.jpa.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IInventoryRepository extends JpaRepository<Inventory, Long> {
}
