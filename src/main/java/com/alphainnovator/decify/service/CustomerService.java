package com.alphainnovator.decify.service;

import java.util.List;
import java.util.Optional;

import com.alphainnovator.decify.core.Entities.CustomerEntity;
import com.alphainnovator.decify.dao.repositories.CustomerRepository;

public class CustomerService implements ICustomerService {


    private CustomerRepository _customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        _customerRepository = customerRepository;
    }

    @Override
    public Optional<CustomerEntity> getCustomerById(int customerId) {
        return _customerRepository.findById(customerId);
    }

    @Override
    public List<CustomerEntity> getAllCustomers() {
        return _customerRepository.findAll();
    }
}
