
package ec.edu.utpl.sic.arqapl.project;

import java.util.List;

public interface IEmpresaDao {
    List<EmpresaDTO>listar();
    EmpresaDTO listarId(int id);
    EmpresaDTO add(EmpresaDTO p);
    EmpresaDTO edit(EmpresaDTO p);
    EmpresaDTO delete(int id);
}
