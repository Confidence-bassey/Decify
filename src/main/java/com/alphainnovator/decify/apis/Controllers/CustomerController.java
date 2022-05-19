package com.alphainnovator.decify.apis.Controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.alphainnovator.decify.core.Entities.CustomerEntity;
import com.alphainnovator.decify.dao.repositories.CustomerRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/customer")
public class CustomerController {
    
    CustomerRepository customerRepository;

    public CustomerController(CustomerRepository demoRepo) {
		this.customerRepository = demoRepo;

	}

    @PostMapping("/create")
    public ResponseEntity<?> addTodo(HttpServletRequest request, @RequestBody CustomerEntity payload) {
        this.customerRepository.save(payload);// this._todos.add(payload);
        List<CustomerEntity> allCustomers = this.customerRepository.findAll();
  
          return ResponseEntity.ok(allCustomers);
      }
    
      @GetMapping("")
      public ResponseEntity<?> getTodos(HttpServletRequest request) {
  
          List<CustomerEntity> admins = this.customerRepository.findAll();
          return ResponseEntity.ok(admins);
      }  
}
