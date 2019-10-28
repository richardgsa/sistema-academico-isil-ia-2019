package pe.isil.systemacademic.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.isil.systemacademic.models.Alumno;
import pe.isil.systemacademic.services.AlumnoService;

@RestController
@RequestMapping("/api")
public class AlumnoResource {
    @Autowired
    AlumnoService alumnoService;

    @GetMapping("/alumnos")
    public ResponseEntity findAll(){
        return new ResponseEntity(alumnoService.getAll(),
                HttpStatus.OK);
    }

    @GetMapping("/alumnos/{id}")
    public ResponseEntity getOne(@PathVariable Long id){
        Alumno alumno = alumnoService.getAlumno(id);
        if (alumno==null){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(alumno,HttpStatus.OK);
    }

    @PostMapping("/alumnos")
    public ResponseEntity create(@RequestBody Alumno alumno){
        alumnoService.createdAlumno(alumno);
        return new ResponseEntity(alumno,HttpStatus.CREATED);
    }

    @PutMapping("/alumnos/{id}")
    public ResponseEntity update(@RequestBody Alumno alumno,
                                 @PathVariable Long id){
        alumno.setId(id);
        alumnoService.updateAlumno(alumno);
        return new ResponseEntity(alumno,HttpStatus.CREATED);
    }
}
