package com.alphainnovator.decify.dao.repositories;

import com.alphainnovator.decify.core.Entities.OrderItemsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItemsEntity, Integer> {
    
}
