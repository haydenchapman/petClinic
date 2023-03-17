package com.haydenC.PetClinic.model.services;

import com.haydenC.PetClinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
