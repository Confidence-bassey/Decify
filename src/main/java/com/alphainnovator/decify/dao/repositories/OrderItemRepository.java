package com.alphainnovator.decify.dao.repositories;

import java.util.List;

import com.alphainnovator.decify.core.Entities.OrderItemsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItemsEntity, Integer> {
    List<OrderItemsEntity> findByOrderId(int orderId);
}
