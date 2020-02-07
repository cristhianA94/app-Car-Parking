/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.sic.arqapl.parkingapp.Persistencia.InterfaceSpring;

import ec.edu.utpl.sic.arqapl.parkingapp.Persistencia.Entity.Usuario;
import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author ESCRITORIO
 */
public interface UsuarioInterface extends Repository<Usuario, Integer>{
    List<Usuario>findAll();
    Usuario findOne(int id);
    Usuario save(Usuario p);
    void delete(Usuario p);
    
}
