package ec.edu.utpl.sic.arqapl.parkingapp.Domain.Entities;

/**
 *
 * @author Crist_Apolo
 */
public class Usuario {
    
    private int idUsuario;
    private String ip;
    private Tarjeta objTarjeta = new Tarjeta();

    public Usuario() {
    }

    public Usuario(int idUser, String ip) {
        this.idUsuario = idUser;
        this.ip = ip;
    }
    
    public Usuario(int idUser, String ip, Tarjeta tarjeta) {
        this.idUsuario = idUser;
        this.ip = ip;
        this.objTarjeta = tarjeta;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Tarjeta getObjTarjeta() {
        return objTarjeta;
    }

    public void setObjTarjeta(Tarjeta objTarjeta) {
        this.objTarjeta = objTarjeta;
    }
    
    // Metodos
    
    public void consultarParqueadero(){
        
    }
    
    public void adquirirTarjeta(){
        
    }
    
    public void reportarPerdidaTarjeta(){
        
    }
    
    public void reservarEspacio(){
        
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUser=" + idUsuario + ", ip=" + ip + ", objTarjeta=" + objTarjeta + '}';
    }    
    
}
