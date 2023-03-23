package com.haydenC.PetClinic.bootstrap;

import com.haydenC.PetClinic.model.Owner;
import com.haydenC.PetClinic.model.Vet;
import com.haydenC.PetClinic.services.OwnerService;
import com.haydenC.PetClinic.services.PetService;
import com.haydenC.PetClinic.services.VetService;
import com.haydenC.PetClinic.services.map.OwnerServiceMap;
import com.haydenC.PetClinic.services.map.PetServiceMap;
import com.haydenC.PetClinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetService petService;
    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
        petService = new PetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);
        System.out.println("Loaded owners.....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);
        System.out.println("Loaded vets.....!");

    }
}