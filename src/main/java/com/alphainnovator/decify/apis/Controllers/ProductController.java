package com.alphainnovator.decify.apis.Controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.alphainnovator.decify.core.Entities.ProductEntity;
import com.alphainnovator.decify.dao.repositories.ProductRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/product")
public class ProductController {

    ProductRepository productRepository;

    public ProductController(ProductRepository demoRepo) {
		this.productRepository = demoRepo;

	}

    @PostMapping("/create")
    public ResponseEntity<?> addTodo(HttpServletRequest request, @RequestBody ProductEntity payload) {
        this.productRepository.save(payload);// this._todos.add(payload);
        List<ProductEntity> allprods = this.productRepository.findAll();
  
          return ResponseEntity.ok(allprods);
      }
    
      @GetMapping("")
      public ResponseEntity<?> getTodos(HttpServletRequest request) {
  
          List<ProductEntity> admins = this.productRepository.findAll();
          return ResponseEntity.ok(admins);
      }  
}
