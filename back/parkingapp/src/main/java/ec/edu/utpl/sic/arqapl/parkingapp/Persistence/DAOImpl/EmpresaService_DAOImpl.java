package ec.edu.utpl.sic.arqapl.parkingapp.Persistence.DAOImpl;

import ec.edu.utpl.sic.arqapl.parkingapp.Domain.Intefaces.IEmpresaDao;

import ec.edu.utpl.sic.arqapl.parkingapp.Persistence.Entities.EmpresaDTO;
import ec.edu.utpl.sic.arqapl.parkingapp.Persistence.Repositories.EmpresaInterface;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class EmpresaService_DAOImpl implements IEmpresaDao {

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
        //return repositorio.create(p);
        return p;
    }

    @Override
    public EmpresaDTO edit(EmpresaDTO p) {
        //return repositorio.edit(p);
        return p;
    }

    @Override
    public EmpresaDTO delete(int id) {
        EmpresaDTO p = repositorio.findOne(id);
        if (p != null) {
            repositorio.delete(p);
        }
        return p;
    }

}
