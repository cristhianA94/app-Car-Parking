/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.sic.arqapl.parkingapp.Persistencia.Entity;

import javax.persistence.*;
/**
 *
 * @author ESCRITORIO
 */
@Entity
@Table(name = "usuario")
public class UsuarioDTO {
   
    @Id
    @Column
    private int idUsuario;
    @Column
    private String ip;
    @Column
    private int Tarjeta;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getTarjeta() {
        return Tarjeta;
    }

    public void setTarjeta(int Tarjeta) {
        this.Tarjeta = Tarjeta;
    }

   
   
}
