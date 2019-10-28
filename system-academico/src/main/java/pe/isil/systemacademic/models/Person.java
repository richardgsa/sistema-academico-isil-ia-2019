package pe.isil.systemacademic.models;

import lombok.Data;

import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public class Person extends BaseEntity{

    private String firstName;
    private String lastNameFather;
    private String lastNameMother;
}
