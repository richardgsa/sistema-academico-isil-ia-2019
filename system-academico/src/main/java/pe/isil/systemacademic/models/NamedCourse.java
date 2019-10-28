package pe.isil.systemacademic.models;

import lombok.Data;

import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public class NamedCourse extends BaseEntity{

    private String nrc;

}
