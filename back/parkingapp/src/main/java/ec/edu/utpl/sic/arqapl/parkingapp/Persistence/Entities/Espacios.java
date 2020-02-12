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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Crist_Apolo
 */
@Entity
@Table(name = "espacios")
@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "Espacios.findAll", query = "SELECT e FROM Espacios e")
//    , @NamedQuery(name = "Espacios.findByIdEspacio", query = "SELECT e FROM Espacios e WHERE e.idEspacio = :idEspacio")
//    , @NamedQuery(name = "Espacios.findByEstado", query = "SELECT e FROM Espacios e WHERE e.estado = :estado")
//    , @NamedQuery(name = "Espacios.findByCubierto", query = "SELECT e FROM Espacios e WHERE e.cubierto = :cubierto")})
public class Espacios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idEspacio")
    private Integer idEspacio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private int estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cubierto")
    private int cubierto;
    @JoinColumn(name = "id_Empresa", referencedColumnName = "idEmpresa")
    @ManyToOne(optional = false)
    private EmpresaDTO idEmpresa;

    public Espacios() {
    }

    public Espacios(Integer idEspacio) {
        this.idEspacio = idEspacio;
    }

    public Espacios(Integer idEspacio, int estado, int cubierto) {
        this.idEspacio = idEspacio;
        this.estado = estado;
        this.cubierto = cubierto;
    }

    public Integer getIdEspacio() {
        return idEspacio;
    }

    public void setIdEspacio(Integer idEspacio) {
        this.idEspacio = idEspacio;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getCubierto() {
        return cubierto;
    }

    public void setCubierto(int cubierto) {
        this.cubierto = cubierto;
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
        hash += (idEspacio != null ? idEspacio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Espacios)) {
            return false;
        }
        Espacios other = (Espacios) object;
        if ((this.idEspacio == null && other.idEspacio != null) || (this.idEspacio != null && !this.idEspacio.equals(other.idEspacio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.utpl.sic.arqapl.parkingapp.Persistence.Entities.Espacios[ idEspacio=" + idEspacio + " ]";
    }
    
}
