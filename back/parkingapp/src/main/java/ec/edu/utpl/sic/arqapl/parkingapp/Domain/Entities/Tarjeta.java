package ec.edu.utpl.sic.arqapl.parkingapp.Domain.Entities;

import java.util.List;

/**
 *
 * @author Crist_Apolo
 */
public class Tarjeta {

    private int idTarjeta;
    private Double saldo;
    private int estado;
    private List<Usuario> lstUsuario;

    public Tarjeta() {
    }

    public Tarjeta(int idTarjeta, Double saldo, int estado) {
        this.idTarjeta = idTarjeta;
        this.saldo = saldo;
        this.estado = estado;
    }

    public Tarjeta(int idTarjeta, Double saldo, int estado, List<Usuario> lstUsuario) {
        this.idTarjeta = idTarjeta;
        this.saldo = saldo;
        this.estado = estado;
        this.lstUsuario = lstUsuario;
    }

    public int getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(int idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public List<Usuario> getLstUsuario() {
        return lstUsuario;
    }

    public void setLstUsuario(List<Usuario> lstUsuario) {
        this.lstUsuario = lstUsuario;
    }

    public void recargarSaldo() {

    }

    public void consultarSaldo() {

    }

    public void pagar() {

    }

    @Override
    public String toString() {
        return "Tarjeta{" + "idTarjeta=" + idTarjeta + ", saldo=" + saldo + ", estado=" + estado + ", lstUsuario=" + lstUsuario + '}';
    }

}
