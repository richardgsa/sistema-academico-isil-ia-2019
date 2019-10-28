package pe.isil.systemacademic.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.isil.systemacademic.models.Curso;
import pe.isil.systemacademic.services.CursoService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CursoResource {
    @Autowired
    CursoService cursoService;

    @GetMapping("/cursos")
    public ResponseEntity findAll(){
        return new ResponseEntity(cursoService.getAll(),
                HttpStatus.OK);
    }

    @GetMapping("/cursos/{id}")
    public ResponseEntity getOne(@PathVariable Long id){
        Curso curso = cursoService.getCurso(id);
        if (curso==null){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(curso,HttpStatus.OK);
    }

    @PostMapping("/cursos")
    public ResponseEntity create(@RequestBody Curso curso){
        cursoService.createdCurso(curso);
        return new ResponseEntity(curso,HttpStatus.CREATED);
    }

    @PutMapping("/cursos/{id}")
    public ResponseEntity update(@RequestBody Curso curso,
                                 @PathVariable Long id){
        curso.setId(id);
        cursoService.updateCurso(curso);
        return new ResponseEntity(curso,HttpStatus.CREATED);
    }
}
