package pe.isil.systemacademic.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Data
@Entity
public class Curso extends NamedCourse{

    private String nombreCurso;
    private String numeroCredito;

    @OneToMany(mappedBy = "curso")
    private Set<AlumnoCursos> alumnoCursos;

    @OneToMany(mappedBy = "curso_id")
    private Set<Ciclo> ciclos;

    @OneToMany(mappedBy = "nota_id")
    private Set<Nota> notas;
}
