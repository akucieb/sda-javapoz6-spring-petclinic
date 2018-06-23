package pl.sda.poznan.spring.petclinic;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Person {
    private String name;
    private String surname;
    private Double age;


}
