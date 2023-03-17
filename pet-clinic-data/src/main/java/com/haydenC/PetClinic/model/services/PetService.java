package com.haydenC.PetClinic.model.services;
import com.haydenC.PetClinic.model.Pet;
import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
