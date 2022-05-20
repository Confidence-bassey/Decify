package com.alphainnovator.decify.service;

import java.util.List;
import java.util.Optional;

import com.alphainnovator.decify.core.Entities.CustomerEntity;

public interface ICustomerService {
    Optional<CustomerEntity> getCustomerById(int customerId);
    List<CustomerEntity> getAllCustomers();
}
