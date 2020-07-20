package com.springframework.asdclinic.services;

import com.springframework.asdclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
