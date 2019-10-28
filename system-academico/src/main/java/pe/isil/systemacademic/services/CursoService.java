package pe.isil.systemacademic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.isil.systemacademic.models.Curso;
import pe.isil.systemacademic.repositories.CursoRepository;

import java.util.List;

@Service
public class CursoService {
    @Autowired
    private CursoRepository cursoRepository;

    //crear
    public void createdCurso(Curso curso){
        cursoRepository.save(curso);
    }

    //actualizar
    public void updateCurso(Curso curso){
        Curso currentCurso = getCurso(curso.getId());
        if (currentCurso != null){
            cursoRepository.save(curso);
        }
    }

    //delete
    public void deleteCurso(Curso curso){
        Curso currentCurso = getCurso(curso.getId());
        if (currentCurso != null){
            cursoRepository.delete(curso);
        }
    }

    //listar
    public List<Curso> getAll(){
        return cursoRepository.findAll();
    }

    //porid
    public Curso getCurso(Long postId){
        return cursoRepository.getOne(postId);
    }

}
