package com.springframework.asdclinic.services;

import com.springframework.asdclinic.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLikeIgnoreCase(String lastName);
}
