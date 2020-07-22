package com.springframework.asdclinic.repositories;

import com.springframework.asdclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
    
}
