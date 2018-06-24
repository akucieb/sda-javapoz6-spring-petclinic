package pl.sda.poznan.spring.petclinic.service;

import org.springframework.stereotype.Service;
import pl.sda.poznan.spring.petclinic.exception.OwnerNotFundException;
import pl.sda.poznan.spring.petclinic.model.Owner;
import pl.sda.poznan.spring.petclinic.repository.OwnerRepository;

import java.util.Collection;
import java.util.Optional;

@Service
public class BaseOwnerService implements OwnerService {

    private final OwnerRepository ownerRepository;

    public BaseOwnerService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public Owner findOwnerById(Long id) {
        Optional<Owner> optionalOwner = ownerRepository.findById(id);
        Owner owner = optionalOwner.orElseThrow(OwnerNotFundException::new);
        return owner;
    }

    @Override
    public Collection<Owner> findAllOwners() {
        return null;
    }

    @Override
    public void save(Owner owner) {

    }

    @Override
    public Collection<Owner> findOwnerByLastname(String lastname) {
        return null;
    }
}
