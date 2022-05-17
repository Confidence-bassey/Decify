package com.alphainnovator.decify.dao.repositories;

import com.alphainnovator.decify.core.Entities.ServiceProviderEntity;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceProviderRepository extends JpaRepository<ServiceProviderEntity, String> {

}
