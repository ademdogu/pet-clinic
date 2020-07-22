package com.springframework.asdclinic.repositories;

import com.springframework.asdclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
    
}
