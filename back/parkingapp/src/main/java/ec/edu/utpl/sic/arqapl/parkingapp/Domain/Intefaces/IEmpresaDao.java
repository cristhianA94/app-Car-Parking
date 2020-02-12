
package ec.edu.utpl.sic.arqapl.parkingapp.Domain.Intefaces;

import java.util.List;

import ec.edu.utpl.sic.arqapl.parkingapp.Persistence.Entities.EmpresaDTO;

public interface IEmpresaDao {
    List<EmpresaDTO>listar();
    EmpresaDTO listarId(int id);
    EmpresaDTO add(EmpresaDTO p);
    EmpresaDTO edit(EmpresaDTO p);
    EmpresaDTO delete(int id);
}
