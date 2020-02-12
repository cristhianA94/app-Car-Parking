package ec.edu.utpl.sic.arqapl.parkingapp.Domain.Entities;

import java.util.Date;

/**
 *
 * @author Crist_Apolo
 */
public class Reserva {

    private int idReserva;
    private Date horaInicio;
    private Date horaSalida;
    private Tarjeta objTarjeta;
    private Empresa objEmpresa;

    public Reserva() {
    }

    public Reserva(int idReserva, Date horaInicio, Date horaSalida) {
        this.idReserva = idReserva;
        this.horaInicio = horaInicio;
        this.horaSalida = horaSalida;
    }

    public Reserva(int idReserva, Date horaInicio, Date horaSalida, Tarjeta objTarjeta, Empresa objEmpresa) {
        this.idReserva = idReserva;
        this.horaInicio = horaInicio;
        this.horaSalida = horaSalida;
        this.objTarjeta = objTarjeta;
        this.objEmpresa = objEmpresa;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Tarjeta getObjTarjeta() {
        return objTarjeta;
    }

    public void setObjTarjeta(Tarjeta objTarjeta) {
        this.objTarjeta = objTarjeta;
    }

    public Empresa getObjEmpresa() {
        return objEmpresa;
    }

    public void setObjEmpresa(Empresa objEmpresa) {
        this.objEmpresa = objEmpresa;
    }

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", horaInicio=" + horaInicio + ", horaSalida=" + horaSalida + ", objTarjeta=" + objTarjeta + ", objEmpresa=" + objEmpresa + '}';
    }

}
