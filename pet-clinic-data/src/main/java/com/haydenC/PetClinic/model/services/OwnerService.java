package com.haydenC.PetClinic.model.services;

import com.haydenC.PetClinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
