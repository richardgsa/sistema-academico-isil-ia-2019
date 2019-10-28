package pe.isil.systemacademic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.isil.systemacademic.models.Alumno;
import pe.isil.systemacademic.repositories.AlumnoRepository;

import java.util.List;

@Service
public class AlumnoService {
    @Autowired
    private AlumnoRepository alumnoRepository;

    //crear
    public void createdAlumno(Alumno alumno){
        alumnoRepository.save(alumno);
    }

    //actualizar
    public void updateAlumno(Alumno alumno){
        Alumno currentAlumno = getAlumno(alumno.getId());
        if (currentAlumno != null){
            alumnoRepository.save(alumno);
        }
    }

    //delete
    public void deleteAlumno(Alumno alumno){
        Alumno currentAlumno = getAlumno(alumno.getId());
        if (currentAlumno != null){
            alumnoRepository.delete(alumno);
        }
    }

    //listar
    public List<Alumno> getAll(){
        return alumnoRepository.findAll();
    }

    //porid
    public Alumno getAlumno(Long postId){
        return alumnoRepository.getOne(postId);
    }

}
