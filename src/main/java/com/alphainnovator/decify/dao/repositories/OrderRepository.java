package com.alphainnovator.decify.dao.repositories;

import java.util.List;

import com.alphainnovator.decify.core.Entities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {
    List<OrderEntity> findByCustomerId(int customerId); 
}
