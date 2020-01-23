
package ec.edu.utpl.sic.arqapl.project;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaServiceImp implements IEmpresaDao{
    @Autowired
    private EmpresaInterface repositorio;
    
    @Override
    public List<EmpresaDTO> listar() {
        return repositorio.findAll();
    }

    @Override
    public EmpresaDTO listarId(int id) {
        return repositorio.findOne(id);
    }

    @Override
    public EmpresaDTO add(EmpresaDTO p) {
        return repositorio.save(p);
    }

    @Override
    public EmpresaDTO edit(EmpresaDTO p) {
        return repositorio.save(p);
    }

    @Override
    public EmpresaDTO delete(int id) {
        EmpresaDTO p=repositorio.findOne(id);
        if(p!=null){
            repositorio.delete(p);
        }
       return p;
    }
    
    
    
}
