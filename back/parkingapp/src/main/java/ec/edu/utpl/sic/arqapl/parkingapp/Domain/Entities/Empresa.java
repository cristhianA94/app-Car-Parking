package ec.edu.utpl.sic.arqapl.parkingapp.Domain.Entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ESCRITORIO
 */
public class Empresa {

    private int idEmpresa;
    private String nombre;
    private String direccion;
    private String latitud;
    private String longitud;
    private int num_espacios;
    private String fraccion;
    private Double precio;
    private Double descuento;
    public List<ServiciosAdicionales> lstServiciosA = new ArrayList<>();
    public List<Espacios> lstEspacios = new ArrayList<>();
    public List<Reserva> lstReservas = new ArrayList<>();
    public List<Pago> lstPagos = new ArrayList<>();

    public Empresa() {
    }

    public Empresa(int id, String nombre, String direccion, String latitud, String longitud, int num_espacios, String fraccion, Double precio, Double descuento) {
        this.idEmpresa = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.num_espacios = num_espacios;
        this.fraccion = fraccion;
        this.precio = precio;
        this.descuento = descuento;
    }

    public Empresa(int id, String nombre, String direccion, String latitud, String longitud, int num_espacios, String fraccion, Double precio, Double descuento, List<ServiciosAdicionales> lstServicios, List<Espacios> lstEspacios, List<Reserva> lstReservas, List<Pago> lstPagos) {
        this.idEmpresa = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.num_espacios = num_espacios;
        this.fraccion = fraccion;
        this.precio = precio;
        this.descuento = descuento;
        this.lstServiciosA = lstServicios;
        this.lstEspacios = lstEspacios;
        this.lstReservas = lstReservas;
        this.lstPagos = lstPagos;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public int getNum_espacios() {
        return num_espacios;
    }

    public void setNum_espacios(int num_espacios) {
        this.num_espacios = num_espacios;
    }

    public String getFraccion() {
        return fraccion;
    }

    public void setFraccion(String fraccion) {
        this.fraccion = fraccion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public List<ServiciosAdicionales> getLstServiciosA() {
        return lstServiciosA;
    }

    public void setLstServiciosA(List<ServiciosAdicionales> lstServiciosA) {
        this.lstServiciosA = lstServiciosA;
    }

    public List<Espacios> getLstEspacios() {
        return lstEspacios;
    }

    public void setLstEspacios(List<Espacios> lstEspacios) {
        this.lstEspacios = lstEspacios;
    }

    public List<Reserva> getLstReservas() {
        return lstReservas;
    }

    public void setLstReservas(List<Reserva> lstReservas) {
        this.lstReservas = lstReservas;
    }

    public List<Pago> getLstPagos() {
        return lstPagos;
    }

    public void setLstPagos(List<Pago> lstPagos) {
        this.lstPagos = lstPagos;
    }

    @Override
    public String toString() {
        return "Empresa{" + "idEmpresa=" + idEmpresa + ", nombre=" + nombre + ", direccion=" + direccion + ", latitud=" + latitud + ", longitud=" + longitud + ", num_espacios=" + num_espacios + ", fraccion=" + fraccion + ", precio=" + precio + ", descuento=" + descuento + ", lstServiciosA=" + lstServiciosA + ", lstEspacios=" + lstEspacios + ", lstReservas=" + lstReservas + ", lstPagos=" + lstPagos + '}';
    }

}
