package ec.edu.utpl.sic.arqapl.parkingapp.Domain.Entities;

/**
 *
 * @author Crist_Apolo
 */
public class Espacios {

    private int idEspacio;
    private int estado; //0 o 1: libre / ocupado 
    private int cubierto; //0 o 1: no / si
    private Empresa objEmpresa;

    public Espacios() {
    }

    public Espacios(int idEspacio, int estado, int cubierto) {
        this.idEspacio = idEspacio;
        this.estado = estado;
        this.cubierto = cubierto;
    }

    public Espacios(int idEspacio, int estado, int cubierto, Empresa objEmpresa) {
        this.idEspacio = idEspacio;
        this.estado = estado;
        this.cubierto = cubierto;
        this.objEmpresa = objEmpresa;
    }

    public int getIdEspacio() {
        return idEspacio;
    }

    public void setIdEspacio(int idEspacio) {
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

    public Empresa getObjEmpresa() {
        return objEmpresa;
    }

    public void setObjEmpresa(Empresa objEmpresa) {
        this.objEmpresa = objEmpresa;
    }

    // Metodos
    public void reservarEspacio() {

    }

    @Override
    public String toString() {
        return "Espacios{" + "idEspacio=" + idEspacio + ", estado=" + estado + ", cubierto=" + cubierto + ", objEmpresa=" + objEmpresa + '}';
    }

}
