package ec.edu.utpl.sic.arqapl.parkingapp.Persistence.Repositories;


import java.util.List;
import org.springframework.data.repository.Repository;

import ec.edu.utpl.sic.arqapl.parkingapp.Persistence.Entities.EmpresaDTO;

public interface EmpresaInterface extends Repository<EmpresaDTO, Integer>{
    /* Importar clase de UseCase
    
    Instanciar objeto de la Persistencia.Entities
    EmpresaDTO objpersis = new EmpresaDTO
    
    obj.set = ...
    
    Instanciar objeto JPA Controller
    EmpresaJPAController objContr = new EmpresaJPAController
    
    objControler.metodosJPA(obj)
    
    */
    
    
    List<EmpresaDTO>findAll();
    EmpresaDTO findOne(int id);
    EmpresaDTO save(EmpresaDTO p);
    void delete(EmpresaDTO p);
}
