package com.haydenC.PetClinic.services;
import com.haydenC.PetClinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}
