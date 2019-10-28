package pe.isil.systemacademic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.isil.systemacademic.models.AlumnoCursos;
import pe.isil.systemacademic.models.AlumnoCursosKey;

@Repository
public interface AlumnoCursosRepository extends JpaRepository<AlumnoCursos, AlumnoCursosKey> {
}
