package com.alphainnovator.decify.dao.repositories;

import com.alphainnovator.decify.core.Entities.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<CartEntity, Integer> {
    void deleteByCustomerId(int customerId);
}
