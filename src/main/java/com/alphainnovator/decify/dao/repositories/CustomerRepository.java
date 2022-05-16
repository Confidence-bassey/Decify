package com.alphainnovator.decify.dao.repositories;

import com.alphainnovator.decify.core.Entities.CustomerEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer>{
    
}
