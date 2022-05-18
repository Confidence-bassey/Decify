package com.alphainnovator.decify.dao.repositories;

import com.alphainnovator.decify.core.Entities.OrderEntity;
import com.alphainnovator.decify.core.Entities.ServiceProviderEntity;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, String> {
  //boolean existsByType_Id(String orderId);
  //boolean exists();
  OrderEntity findAllByCustomerId(String customerId);
}
