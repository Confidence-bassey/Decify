package com.alphainnovator.decify.apis.Controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.alphainnovator.decify.core.Entities.OrderEntity;
import com.alphainnovator.decify.dao.repositories.OrderRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@CrossOrigin
@RestController
@RequestMapping("/order")
public class orderController {

    OrderRepository orderRepository;

    public orderController(OrderRepository demoRepo) {
		this.orderRepository = demoRepo;
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> addTodo(HttpServletRequest request, @RequestBody OrderEntity payload) {
        this.orderRepository.save(payload);
        List<OrderEntity> allAmins = this.orderRepository.findAll();
  
          return ResponseEntity.ok(allAmins);
      }
    
      @GetMapping("")
      public ResponseEntity<?> getTodos(HttpServletRequest request) {
  
          List<OrderEntity> admins = this.orderRepository.findAll();
          return ResponseEntity.ok(admins);
      }
}
