/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.sic.arqapl.parkingapp.Intefaces;
import java.util.List;

import ec.edu.utpl.sic.arqapl.parkingapp.Persistencia.Entity.UsuarioDTO;
/**
 *
 * @author ESCRITORIO
 */
public interface IUsuarioDao {
    List<UsuarioDTO>listar();
    UsuarioDTO listarId(int id);
    UsuarioDTO add(UsuarioDTO u);
    UsuarioDTO edit(UsuarioDTO u);
    UsuarioDTO delete(int id);
}
