package ec.edu.utpl.sic.arqapl.parkingapp.Core.Entity;

/**
 *
 * @author Crist_Apolo
 */
public class ServiciosAdicionales {
    
    private int idServicioA;
    private String nombre;
    private float precio;
    private int cantidad;
    public Empresa objEmpresa = new Empresa();

    public ServiciosAdicionales() {
    }

    
    public ServiciosAdicionales(int idServicioA, String nombre, float precio, int cantidad) {
        this.idServicioA = idServicioA;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    public ServiciosAdicionales(int idServicioA, String nombre, float precio, int cantidad, Empresa obj) {
        this.idServicioA = idServicioA;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.objEmpresa = obj;
    }

    public int getIdServicioA() {
        return idServicioA;
    }

    public void setIdServicioA(int idServicioA) {
        this.idServicioA = idServicioA;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Empresa getObjEmpresa() {
        return objEmpresa;
    }

    public void setObjEmpresa(Empresa objEmpresa) {
        this.objEmpresa = objEmpresa;
    }

    @Override
    public String toString() {
        return "ServiciosAdicionales{" + "idServicioA=" + idServicioA + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + ", objEmpresa=" + objEmpresa + '}';
    }
    
}
