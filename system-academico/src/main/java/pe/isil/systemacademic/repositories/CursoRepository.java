package pe.isil.systemacademic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.isil.systemacademic.models.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso,Long> {
}
