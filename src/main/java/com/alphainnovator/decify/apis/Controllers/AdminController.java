package com.alphainnovator.decify.apis.Controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.alphainnovator.decify.core.Entities.AdminEntity;
import com.alphainnovator.decify.dao.repositories.AdminRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Admin")
public class AdminController {

    AdminRepository adminRepository;

    public AdminController(AdminRepository demoRepo) {
		this.adminRepository = demoRepo;

	}


    @PostMapping("/create")
    public ResponseEntity<?> addTodo(HttpServletRequest request, @RequestBody AdminEntity payload) {
        this.adminRepository.save(payload);// this._todos.add(payload);
        List<AdminEntity> allAmins = this.adminRepository.findAll();
  
          return ResponseEntity.ok(allAmins);
      }
    
      @GetMapping("")
      public ResponseEntity<?> getTodos(HttpServletRequest request) {
  
          List<AdminEntity> admins = this.adminRepository.findAll();
          return ResponseEntity.ok(admins);
      }  
      
}
