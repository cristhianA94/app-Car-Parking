/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.sic.arqapl.parkingapp.Persistencia.DAOImpl;



import ec.edu.utpl.sic.arqapl.parkingapp.Intefaces.IUsuarioDao;
import ec.edu.utpl.sic.arqapl.parkingapp.Persistencia.Entity.UsuarioDTO;
import ec.edu.utpl.sic.arqapl.parkingapp.Persistencia.InterfaceSpring.UsuarioInterface;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author ESCRITORIO
 */
public class UsuarioService_DAOImpl implements  IUsuarioDao{
    @Autowired
    private UsuarioInterface repositoR;

    @Override
    public List<UsuarioDTO> listar() {
        return repositoR.findAll();
    }

    @Override
    public UsuarioDTO listarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UsuarioDTO add(UsuarioDTO u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UsuarioDTO edit(UsuarioDTO u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UsuarioDTO delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}
