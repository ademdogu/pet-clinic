package com.springframework.asdclinic.repositories;

import com.springframework.asdclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
    
}
