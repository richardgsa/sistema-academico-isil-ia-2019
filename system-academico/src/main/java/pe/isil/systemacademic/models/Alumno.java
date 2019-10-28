package pe.isil.systemacademic.models;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Set;

//DESARROLLADO POR RICHARD GARCIA
@Data
@Entity
@Table(name = "Alumno")
public class Alumno extends Person {

    private String dni;
    private String direccion;
    private String telefono;
    private String email;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaNacimiento;

    @OneToMany(mappedBy = "alumno")
    private Set<AlumnoCursos> alumnoCursos;

    @OneToMany(mappedBy = "alumno_id")
    private Set<Incidencia> incidencias;

  /*  @OneToOne(mappedBy = "alumno_id",
            fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @MapsId
    private Nota nota;*/

    //uno a muchos
    @OneToMany(mappedBy = "alumno_id")
    private Set<Nota> notas;
}
