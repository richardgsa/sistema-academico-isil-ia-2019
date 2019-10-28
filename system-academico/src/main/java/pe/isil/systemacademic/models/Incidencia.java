package pe.isil.systemacademic.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Incidencia")
public class Incidencia{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "incidencia_id")
    private Long incidencia_id;

    private String impacto;
    private String impactoDescripcion;

    //@ManyToOne(targetEntity = Alumno.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @ManyToOne
    @MapsId("alumno_id")
    @JoinColumn(name = "alumno_id")
    private Alumno alumno_id;
}
