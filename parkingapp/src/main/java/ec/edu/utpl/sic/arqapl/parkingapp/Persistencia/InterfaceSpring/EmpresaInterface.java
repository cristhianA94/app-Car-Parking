
package ec.edu.utpl.sic.arqapl.parkingapp.Persistencia.InterfaceSpring;


import java.util.List;
import org.springframework.data.repository.Repository;

import ec.edu.utpl.sic.arqapl.parkingapp.Persistencia.Entity.EmpresaDTO;

public interface EmpresaInterface extends Repository<EmpresaDTO, Integer>{
    List<EmpresaDTO>findAll();
    EmpresaDTO findOne(int id);
    EmpresaDTO save(EmpresaDTO p);
    void delete(EmpresaDTO p);
}
