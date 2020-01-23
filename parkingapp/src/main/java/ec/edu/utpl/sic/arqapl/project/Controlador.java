
package ec.edu.utpl.sic.arqapl.project;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"personas"})
public class Controlador {
    
    @Autowired
    IEmpresaDao service;
    
    @GetMapping
    public List<EmpresaDTO>listar(){
        return service.listar();
    }
    @PostMapping
    public EmpresaDTO agregar(@RequestBody EmpresaDTO p){
        return service.add(p);
    }
    @GetMapping(path = {"/{id}"})
    public EmpresaDTO listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }
    @PutMapping(path = {"/{id}"})
    public EmpresaDTO editar(@RequestBody EmpresaDTO p,@PathVariable("id") int id){
        p.setId(id);
        return service.edit(p);
    }
    @DeleteMapping(path = {"/{id}"})
    public EmpresaDTO delete(@PathVariable("id") int  id){
        return service.delete(id);
    }
}
