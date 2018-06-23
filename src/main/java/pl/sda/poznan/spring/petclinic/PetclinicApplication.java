package pl.sda.poznan.spring.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetclinicApplication {

    public static void main(String[] args) {

        SpringApplication.run(PetclinicApplication.class, args);

        Person person = Person.builder()
                .age(25d)
                .name("Anita")
                .surname("Kowalska")
                .build();
    }
}