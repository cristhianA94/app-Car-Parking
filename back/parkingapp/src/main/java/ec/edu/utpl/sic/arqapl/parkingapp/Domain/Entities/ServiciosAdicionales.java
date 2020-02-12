package ec.edu.utpl.sic.arqapl.parkingapp.Domain.Entities;

/**
 *
 * @author Crist_Apolo
 */
public class ServiciosAdicionales {
    
    private int idServicioA;
    private String nombre;
    private Double precio;
    private int cantidad;
    public Empresa objEmpresa = new Empresa();

    public ServiciosAdicionales() {
    }

    
    public ServiciosAdicionales(int idServicioA, String nombre, Double precio, int cantidad) {
        this.idServicioA = idServicioA;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    public ServiciosAdicionales(int idServicioA, String nombre, Double precio, int cantidad, Empresa obj) {
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

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
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
