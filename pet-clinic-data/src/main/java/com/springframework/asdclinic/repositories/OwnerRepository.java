package com.springframework.asdclinic.repositories;

import com.springframework.asdclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
