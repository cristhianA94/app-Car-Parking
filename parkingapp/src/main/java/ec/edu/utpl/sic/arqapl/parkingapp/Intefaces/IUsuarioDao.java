/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.sic.arqapl.parkingapp.Intefaces;
import java.util.List;

import ec.edu.utpl.sic.arqapl.parkingapp.Persistencia.Entity.Usuario;
/**
 *
 * @author ESCRITORIO
 */
public interface IUsuarioDao {
    List<Usuario>listar();
    Usuario listarId(int id);
    Usuario add(Usuario u);
    Usuario edit(Usuario u);
    Usuario delete(int id);
}
