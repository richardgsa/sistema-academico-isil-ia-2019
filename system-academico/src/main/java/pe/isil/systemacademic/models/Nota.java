package pe.isil.systemacademic.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Nota")
public class Nota {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "nota_id")
    private Long nota_id;

    private String ua1;
    private String ua2;
    private String ua3;
    private String ua4;
    private String evPermanente1;
    private String evPermanente2;
    private String parcial;
    private String finCiclo;

    /*@OneToOne
    @JoinColumn(name = "alumno_id")
    private Alumno alumno;*/

    //muchos a uno
    @ManyToOne
    @MapsId("alumno_id")
    @JoinColumn(name = "alumno_id")
    private Alumno alumno_id;

    @ManyToOne
    @MapsId("curso_id")
    @JoinColumn(name = "curso_id")
    private Curso curso_id;
}
