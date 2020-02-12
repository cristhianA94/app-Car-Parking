package ec.edu.utpl.sic.arqapl.parkingapp.Domain.Entities;

import ec.edu.utpl.sic.arqapl.parkingapp.Domain.Intefaces.FabricaAbstracta;
import ec.edu.utpl.sic.arqapl.parkingapp.Domain.Intefaces.IMetododePago;

/**
 *
 * @author Crist_Apolo
 */
public class Pago implements FabricaAbstracta {

    private int idPago;
    private Double valor;
    private Empresa objEmpresa;
    private Tarjeta objTarjeta;

    public Pago() {
    }

    public Pago(int idPago, Double valor) {
        this.idPago = idPago;
        this.valor = valor;
    }

    public Pago(int idPago, Double valor, Empresa objEmpresa, Tarjeta objTarjeta) {
        this.idPago = idPago;
        this.valor = valor;
        this.objEmpresa = objEmpresa;
        this.objTarjeta = objTarjeta;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Empresa getObjEmpresa() {
        return objEmpresa;
    }

    public void setObjEmpresa(Empresa objEmpresa) {
        this.objEmpresa = objEmpresa;
    }

    public Tarjeta getObjTarjeta() {
        return objTarjeta;
    }

    public void setObjTarjeta(Tarjeta objTarjeta) {
        this.objTarjeta = objTarjeta;
    }

    @Override
    public IMetododePago metododePago(String cadena) {

        if (cadena.equals("Efectivo")) {
            return new Efectivo();
        }
        if (cadena.equals("TarjetaParking")) {
            return new TarjetaParking();
        }
        if (cadena.equals("Credito")) {
            return new TarjetaCredito();
        }

        return null;
    }

    @Override
    public String toString() {
        return "Pago{" + "idPago=" + idPago + ", valor=" + valor + ", objEmpresa=" + objEmpresa + ", objTarjeta=" + objTarjeta + '}';
    }

}
