package com.alphainnovator.decify.apis.Controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.alphainnovator.decify.core.Entities.ServiceProviderEntity;
import com.alphainnovator.decify.dao.repositories.ServiceProviderRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@CrossOrigin
@RestController
@RequestMapping("/services")
public class ServiceProviderController {

    ServiceProviderRepository serviceRepository;

    public ServiceProviderController(ServiceProviderRepository demoRepo) {
		this.serviceRepository = demoRepo;

	}

    @PostMapping("/create")
    public ResponseEntity<?> addTodo(HttpServletRequest request, @RequestBody ServiceProviderEntity payload) {
        this.serviceRepository.save(payload);// this._todos.add(payload);
        List<ServiceProviderEntity> allprods = this.serviceRepository.findAll();
  
          return ResponseEntity.ok(allprods);
      }
    
      @GetMapping("")
      public ResponseEntity<?> getTodos(HttpServletRequest request) {
  
          List<ServiceProviderEntity> admins = this.serviceRepository.findAll();
          return ResponseEntity.ok(admins);
      }
}
