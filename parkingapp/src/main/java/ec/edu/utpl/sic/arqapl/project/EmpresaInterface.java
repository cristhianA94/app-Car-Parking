
package ec.edu.utpl.sic.arqapl.project;


import java.util.List;
import org.springframework.data.repository.Repository;

public interface EmpresaInterface extends Repository<Empresa, Integer>{
    List<Empresa>findAll();
    Empresa findOne(int id);
    Empresa save(Empresa p);
    void delete(Empresa p);
}
