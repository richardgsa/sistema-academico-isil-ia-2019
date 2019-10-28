package pe.isil.systemacademic.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.isil.systemacademic.models.Nota;
import pe.isil.systemacademic.services.NotaService;

@RestController
@RequestMapping("/api")
public class NotaResource {
    @Autowired
    NotaService notaService;

    @GetMapping("/notas")
    public ResponseEntity findAll(){
        return new ResponseEntity(notaService.getAllNota(), HttpStatus.OK);
    }

    @GetMapping("/notas/{id}")
    public ResponseEntity getOne(@PathVariable Long id){
        Nota nota = notaService.getNota(id);
        if (nota==null){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(nota,HttpStatus.OK);
    }

    @PostMapping("/notas")
    public ResponseEntity create(@RequestBody Nota nota){
        notaService.createdNota(nota);
        return new ResponseEntity(nota,HttpStatus.CREATED);
    }

    @PutMapping("/notas/{id}")
    public ResponseEntity update(@RequestBody Nota nota,
                                 @PathVariable Long id){
        nota.setNota_id(id);
        notaService.updateNota(nota);
        return new ResponseEntity(nota,HttpStatus.CREATED);
    }
}
