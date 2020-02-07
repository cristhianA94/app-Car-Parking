package ec.edu.utpl.sic.arqapl.parkingapp.Core.Entity;

/**
 *
 * @author Crist_Apolo
 */
public class EspacioParkin {
    
    private int idEspacio;
    private int idEmpresa;
    private boolean estado;
    private boolean cubierto;
    private Empresa objEmpresa; 

    public EspacioParkin() {
    }
    
    public EspacioParkin(int idEspacio, int idEmpresa, boolean estado, boolean cubierto) {
        this.idEspacio = idEspacio;
        this.idEmpresa = idEmpresa;
        this.estado = estado;
        this.cubierto = cubierto;
    }

    public EspacioParkin(int idEspacio, int idEmpresa, boolean estado, boolean cubierto, Empresa objEmpresa) {
        this.idEspacio = idEspacio;
        this.idEmpresa = idEmpresa;
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

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isCubierto() {
        return cubierto;
    }

    public void setCubierto(boolean cubierto) {
        this.cubierto = cubierto;
    }

    public Empresa getObjEmpresa() {
        return objEmpresa;
    }

    public void setObjEmpresa(Empresa objEmpresa) {
        this.objEmpresa = objEmpresa;
    }
    
    // Metodos
    
    public void reservarEspacio(){
        
    }

    @Override
    public String toString() {
        return "EspacioParkin{" + "idEspacio=" + idEspacio + ", idEmpresa=" + idEmpresa + ", estado=" + estado + ", cubierto=" + cubierto + ", objEmpresa=" + objEmpresa + '}';
    }
        
}
