package pe.isil.systemacademic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.isil.systemacademic.models.Curso;
import pe.isil.systemacademic.models.Nota;
import pe.isil.systemacademic.repositories.NotaRepository;

import java.util.List;

@Service
public class NotaService {
    @Autowired
    private NotaRepository notaRepository;

    //crear
    public void createdNota(Nota nota){
        notaRepository.save(nota);
    }

    //actualizar
    public void updateNota(Nota nota){
        Nota currentNota = getNota(nota.getNota_id());
        if (currentNota != null){
            notaRepository.save(nota);
        }
    }

    //delete
    public void deleteNota(Nota nota){
        Nota currentNota = getNota(nota.getNota_id());
        if (currentNota != null){
            notaRepository.delete(nota);
        }
    }

    //listar
    public List<Nota> getAllNota() {
        return notaRepository.findAll();
    }

    //porid
    public Nota getNota(Long notaId){
        return notaRepository.getOne(notaId);
    }
}
