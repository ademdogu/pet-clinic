package com.springframework.asdclinic.repositories;

import com.springframework.asdclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
    
}
