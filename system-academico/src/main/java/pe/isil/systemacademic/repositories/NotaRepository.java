package pe.isil.systemacademic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.isil.systemacademic.models.Nota;

@Repository
public interface NotaRepository extends JpaRepository<Nota,Long> {
}
