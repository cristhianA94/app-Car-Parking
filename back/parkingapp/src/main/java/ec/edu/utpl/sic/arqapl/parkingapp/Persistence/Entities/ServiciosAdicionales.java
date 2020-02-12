/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.sic.arqapl.parkingapp.Persistence.Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Crist_Apolo
 */
@Entity
@Table(name = "servicios_adicionales")
@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "ServiciosAdicionales.findAll", query = "SELECT s FROM ServiciosAdicionales s")
//    , @NamedQuery(name = "ServiciosAdicionales.findByIdServicioA", query = "SELECT s FROM ServiciosAdicionales s WHERE s.idServicioA = :idServicioA")
//    , @NamedQuery(name = "ServiciosAdicionales.findByNombre", query = "SELECT s FROM ServiciosAdicionales s WHERE s.nombre = :nombre")
//    , @NamedQuery(name = "ServiciosAdicionales.findByPrecio", query = "SELECT s FROM ServiciosAdicionales s WHERE s.precio = :precio")
//    , @NamedQuery(name = "ServiciosAdicionales.findByCantidad", query = "SELECT s FROM ServiciosAdicionales s WHERE s.cantidad = :cantidad")
//    , @NamedQuery(name = "ServiciosAdicionales.findByDescuento", query = "SELECT s FROM ServiciosAdicionales s WHERE s.descuento = :descuento")})
public class ServiciosAdicionales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idServicioA")
    private Integer idServicioA;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio")
    private double precio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "descuento")
    private Double descuento;
    @JoinColumn(name = "id_Empresa", referencedColumnName = "idEmpresa")
    @ManyToOne(optional = false)
    private EmpresaDTO idEmpresa;

    public ServiciosAdicionales() {
    }

    public ServiciosAdicionales(Integer idServicioA) {
        this.idServicioA = idServicioA;
    }

    public ServiciosAdicionales(Integer idServicioA, String nombre, double precio, int cantidad) {
        this.idServicioA = idServicioA;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Integer getIdServicioA() {
        return idServicioA;
    }

    public void setIdServicioA(Integer idServicioA) {
        this.idServicioA = idServicioA;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public EmpresaDTO getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(EmpresaDTO idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idServicioA != null ? idServicioA.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ServiciosAdicionales)) {
            return false;
        }
        ServiciosAdicionales other = (ServiciosAdicionales) object;
        if ((this.idServicioA == null && other.idServicioA != null) || (this.idServicioA != null && !this.idServicioA.equals(other.idServicioA))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.utpl.sic.arqapl.parkingapp.Persistence.Entities.ServiciosAdicionales[ idServicioA=" + idServicioA + " ]";
    }
    
}
