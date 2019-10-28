package pe.isil.systemacademic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.isil.systemacademic.models.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno,Long> {
}
