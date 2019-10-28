package pe.isil.systemacademic.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class AlumnoCursos {

    @EmbeddedId
    private AlumnoCursosKey id;

    @ManyToOne
    @MapsId("alumno_id")
    @JoinColumn(name = "alumno_id")
    private Alumno alumno;

    @ManyToOne
    @MapsId("curso_id")
    @JoinColumn(name = "curso_id")
    private Curso curso;
}
