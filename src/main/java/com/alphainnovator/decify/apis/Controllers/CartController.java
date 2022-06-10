package com.alphainnovator.decify.apis.Controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.alphainnovator.decify.core.Entities.CartEntity;
import com.alphainnovator.decify.dao.repositories.CartRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@CrossOrigin
@RestController
@RequestMapping("/cart")
public class CartController {
    
    CartRepository cartRepository;

    public CartController(CartRepository demoRepo) {
		this.cartRepository = demoRepo;
    }    

    @PostMapping("/create")
    public ResponseEntity<?> addToCart(HttpServletRequest request, @RequestBody CartEntity payload) {
        this.cartRepository.save(payload);// this._todos.add(payload);
        List<CartEntity> allAmins = this.cartRepository.findAll();
  
          return ResponseEntity.ok(allAmins);
      }
    
      @GetMapping("")
      public ResponseEntity<?> getCartItems(HttpServletRequest request) {
  
          List<CartEntity> admins = this.cartRepository.findAll();
          return ResponseEntity.ok(admins);
      }

}
