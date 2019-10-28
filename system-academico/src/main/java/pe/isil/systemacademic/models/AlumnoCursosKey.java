package pe.isil.systemacademic.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@EqualsAndHashCode
@Data
@Embeddable
public class AlumnoCursosKey implements Serializable {

    @Column(name = "alumno_id")
    private Long alumnoId;

    @Column(name = "curso_id")
    private Long cursoId;
}
