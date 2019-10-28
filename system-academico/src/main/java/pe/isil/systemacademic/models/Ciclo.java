package pe.isil.systemacademic.models;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "Ciclo")
public class Ciclo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ciclo_id")
    private Long ciclo_id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaInicio;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaFin ;

    @ManyToOne
    @MapsId("curso_id")
    @JoinColumn(name = "curso_id")
    private Curso curso_id;
}
