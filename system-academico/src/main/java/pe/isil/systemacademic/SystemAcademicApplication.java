package pe.isil.systemacademic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.isil.systemacademic.models.Alumno;
import pe.isil.systemacademic.repositories.AlumnoCursosRepository;
import pe.isil.systemacademic.repositories.AlumnoRepository;
import pe.isil.systemacademic.repositories.CursoRepository;
import pe.isil.systemacademic.repositories.NotaRepository;

@SpringBootApplication
public class SystemAcademicApplication {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Autowired
    private AlumnoCursosRepository alumnoCursosRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private NotaRepository notaRepository;


    public static void main(String[] args) {
        SpringApplication.run(SystemAcademicApplication.class, args);
    }


}
