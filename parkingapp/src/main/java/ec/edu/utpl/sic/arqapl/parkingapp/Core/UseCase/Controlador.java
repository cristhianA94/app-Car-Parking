package ec.edu.utpl.sic.arqapl.parkingapp.Core.UseCase;

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

import ec.edu.utpl.sic.arqapl.parkingapp.Persistencia.Entity.EmpresaDTO;
import ec.edu.utpl.sic.arqapl.parkingapp.Core.Entity.Empresa;
import ec.edu.utpl.sic.arqapl.parkingapp.Intefaces.IEmpresaDao;
import java.util.ArrayList;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"empresa"})
public class Controlador {

    @Autowired
    IEmpresaDao service;

    @GetMapping
    public List<Empresa> listar() {
        List<EmpresaDTO> a = new ArrayList<>();
        a = service.listar();
        Empresa empresa = new Empresa();
        List<Empresa> b=new ArrayList<>();

        for (EmpresaDTO empresaDTO : a) {
            empresa.setId(empresaDTO.getId());
            empresa.setNombre(empresaDTO.getNombre());
            empresa.setDireccion(empresaDTO.getDireccion());
            empresa.setLatitud(empresaDTO.getLatitud());
            empresa.setLongitud(empresaDTO.getLongitud());
            empresa.setNum_espacios(empresaDTO.getNum_espacios());
            empresa.setFraccion(empresaDTO.getFraccion());
            empresa.setPrecio(empresaDTO.getPrecio());
            empresa.setDescuento(empresaDTO.getDescuento());
            b.add(empresa);
            System.out.println(b);
            
        }
        
        return b;
    }

    @PostMapping
    public EmpresaDTO agregar(@RequestBody EmpresaDTO p) {
        return service.add(p);
    }

    @GetMapping(path = {"/{id}"})
    public EmpresaDTO listarId(@PathVariable("id") int id) {
        return service.listarId(id);
    }

    @PutMapping(path = {"/{id}"})
    public EmpresaDTO editar(@RequestBody EmpresaDTO p, @PathVariable("id") int id) {
        p.setId(id);
        return service.edit(p);
    }

    @DeleteMapping(path = {"/{id}"})
    public EmpresaDTO delete(@PathVariable("id") int id) {
        return service.delete(id);
    }
}
