package com.alphainnovator.decify.dao.repositories;

import java.util.Optional;

import com.alphainnovator.decify.core.Entities.CustomerEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer>{
    Optional<CustomerEntity> getCustomerById(int customerId);
}
