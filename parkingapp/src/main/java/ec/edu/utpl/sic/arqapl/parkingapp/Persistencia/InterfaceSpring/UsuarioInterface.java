/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.sic.arqapl.parkingapp.Persistencia.InterfaceSpring;

import ec.edu.utpl.sic.arqapl.parkingapp.Persistencia.Entity.UsuarioDTO;
import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author ESCRITORIO
 */
public interface UsuarioInterface extends Repository<UsuarioDTO, Integer>{
    List<UsuarioDTO>findAll();
    UsuarioDTO findOne(int id);
    UsuarioDTO save(UsuarioDTO p);
    void delete(UsuarioDTO p);
    
}
