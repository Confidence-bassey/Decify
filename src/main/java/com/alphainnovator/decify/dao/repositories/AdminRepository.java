package com.alphainnovator.decify.dao.repositories;

import com.alphainnovator.decify.core.Entities.AdminEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<AdminEntity, Integer> {
    
}
