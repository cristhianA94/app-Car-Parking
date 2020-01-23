
package ec.edu.utpl.sic.arqapl.project;


import java.util.List;
import org.springframework.data.repository.Repository;

public interface EmpresaInterface extends Repository<EmpresaDTO, Integer>{
    List<EmpresaDTO>findAll();
    EmpresaDTO findOne(int id);
    EmpresaDTO save(EmpresaDTO p);
    void delete(EmpresaDTO p);
}
