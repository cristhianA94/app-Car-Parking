/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.sic.arqapl.parkingapp.Core.Entity;

/**
 *
 * @author ESCRITORIO
 */
public class Empresa {
    
    
    
    private int id;
    private String nombre;
    private String direccion;
    private String latitud;
    private String longitud;
    private String num_espacios;
    private String fraccion;
    private String precio;
    private String descuento;

    public Empresa(int id, String nombre, String direccion, String latitud, String longitud, String num_espacios, String fraccion, String precio, String descuento) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.num_espacios = num_espacios;
        this.fraccion = fraccion;
        this.precio = precio;
        this.descuento = descuento;
    }

    public Empresa() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getNum_espacios() {
        return num_espacios;
    }

    public void setNum_espacios(String num_espacios) {
        this.num_espacios = num_espacios;
    }

    public String getFraccion() {
        return fraccion;
    }

    public void setFraccion(String fraccion) {
        this.fraccion = fraccion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }
    
    
    
}
