package com.alphainnovator.decify.dao.repositories;

import com.alphainnovator.decify.core.Entities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, String> {
  
}
