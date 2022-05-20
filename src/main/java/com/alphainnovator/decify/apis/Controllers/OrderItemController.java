package com.alphainnovator.decify.apis.Controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.alphainnovator.decify.core.Entities.OrderItemsEntity;
import com.alphainnovator.decify.dao.repositories.OrderItemRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@CrossOrigin
@RestController
@RequestMapping("/orderItems")
public class OrderItemController {

    OrderItemRepository orderitemRepository;

    public OrderItemController(OrderItemRepository demoRepo) {
		this.orderitemRepository = demoRepo;
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> addTodo(HttpServletRequest request, @RequestBody OrderItemsEntity payload) {
        this.orderitemRepository.save(payload);// this._todos.add(payload);
        List<OrderItemsEntity> allAmins = this.orderitemRepository.findAll();
  
          return ResponseEntity.ok(allAmins);
      }
    
      @GetMapping("")
      public ResponseEntity<?> getTodos(HttpServletRequest request) {
  
          List<OrderItemsEntity> admins = this.orderitemRepository.findAll();
          return ResponseEntity.ok(admins);
      }
}
