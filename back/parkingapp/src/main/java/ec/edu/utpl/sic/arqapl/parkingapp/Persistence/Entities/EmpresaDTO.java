/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.sic.arqapl.parkingapp.Persistence.Entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Crist_Apolo
 */
@Entity
@Table(name = "empresa")
@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "Empresa.findAll", query = "SELECT e FROM Empresa e")
//    , @NamedQuery(name = "Empresa.findByIdEmpresa", query = "SELECT e FROM Empresa e WHERE e.idEmpresa = :idEmpresa")
//    , @NamedQuery(name = "Empresa.findByNombre", query = "SELECT e FROM Empresa e WHERE e.nombre = :nombre")
//    , @NamedQuery(name = "Empresa.findByDireccion", query = "SELECT e FROM Empresa e WHERE e.direccion = :direccion")
//    , @NamedQuery(name = "Empresa.findByLatitud", query = "SELECT e FROM Empresa e WHERE e.latitud = :latitud")
//    , @NamedQuery(name = "Empresa.findByLongitud", query = "SELECT e FROM Empresa e WHERE e.longitud = :longitud")
//    , @NamedQuery(name = "Empresa.findByNumEspacios", query = "SELECT e FROM Empresa e WHERE e.numEspacios = :numEspacios")
//    , @NamedQuery(name = "Empresa.findByFraccion", query = "SELECT e FROM Empresa e WHERE e.fraccion = :fraccion")
//    , @NamedQuery(name = "Empresa.findByPrecio", query = "SELECT e FROM Empresa e WHERE e.precio = :precio")
//    , @NamedQuery(name = "Empresa.findByDescuento", query = "SELECT e FROM Empresa e WHERE e.descuento = :descuento")})
public class EmpresaDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idEmpresa")
    private Integer idEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "latitud")
    private String latitud;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "longitud")
    private String longitud;
    @Basic(optional = false)
    @NotNull
    @Column(name = "num_espacios")
    private int numEspacios;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "fraccion")
    private String fraccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio")
    private double precio;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "descuento")
    private Double descuento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private List<ServiciosAdicionales> serviciosAdicionalesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private List<Reserva> reservaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private List<Pago> pagoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private List<Espacios> espaciosList;

    public EmpresaDTO() {
    }

    public EmpresaDTO(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public EmpresaDTO(Integer idEmpresa, String nombre, String direccion, String latitud, String longitud, int numEspacios, String fraccion, double precio) {
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
        this.direccion = direccion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.numEspacios = numEspacios;
        this.fraccion = fraccion;
        this.precio = precio;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
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

    public int getNumEspacios() {
        return numEspacios;
    }

    public void setNumEspacios(int numEspacios) {
        this.numEspacios = numEspacios;
    }

    public String getFraccion() {
        return fraccion;
    }

    public void setFraccion(String fraccion) {
        this.fraccion = fraccion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    @XmlTransient
    public List<ServiciosAdicionales> getServiciosAdicionalesList() {
        return serviciosAdicionalesList;
    }

    public void setServiciosAdicionalesList(List<ServiciosAdicionales> serviciosAdicionalesList) {
        this.serviciosAdicionalesList = serviciosAdicionalesList;
    }

    @XmlTransient
    public List<Reserva> getReservaList() {
        return reservaList;
    }

    public void setReservaList(List<Reserva> reservaList) {
        this.reservaList = reservaList;
    }

    @XmlTransient
    public List<Pago> getPagoList() {
        return pagoList;
    }

    public void setPagoList(List<Pago> pagoList) {
        this.pagoList = pagoList;
    }

    @XmlTransient
    public List<Espacios> getEspaciosList() {
        return espaciosList;
    }

    public void setEspaciosList(List<Espacios> espaciosList) {
        this.espaciosList = espaciosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpresa != null ? idEmpresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpresaDTO)) {
            return false;
        }
        EmpresaDTO other = (EmpresaDTO) object;
        if ((this.idEmpresa == null && other.idEmpresa != null) || (this.idEmpresa != null && !this.idEmpresa.equals(other.idEmpresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.utpl.sic.arqapl.parkingapp.Persistence.Entities.Empresa[ idEmpresa=" + idEmpresa + " ]";
    }
    
}
