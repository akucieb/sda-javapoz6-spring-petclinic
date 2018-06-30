package pl.sda.poznan.spring.petclinic.service;

import pl.sda.poznan.spring.petclinic.model.Owner;

import java.util.Collection;
import java.util.Optional;

public interface OwnerService {
    Owner findOwnerById(Long id);

    Collection<Owner> findAllOwners();

    void save(Owner owner);

    Collection<Owner> findOwnerByLastname(String lastname);

    void saveOwner(Owner owner);
}
