package com.alphainnovator.decify.dao.repositories;

import com.alphainnovator.decify.core.Entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer>{
    
}
