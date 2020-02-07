package ec.edu.utpl.sic.arqapl.parkingapp.Core.Entity;

/**
 *
 * @author Crist_Apolo
 */
public class Usuario {
    
    private int idUser;
    private String ip;
    private Tarjeta objTarjeta = new Tarjeta();

    public Usuario() {
    }

    public Usuario(int idUser, String ip) {
        this.idUser = idUser;
        this.ip = ip;
    }
    
    public Usuario(int idUser, String ip, Tarjeta tarjeta) {
        this.idUser = idUser;
        this.ip = ip;
        this.objTarjeta = tarjeta;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
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
        return "Usuario{" + "idUser=" + idUser + ", ip=" + ip + ", objTarjeta=" + objTarjeta + '}';
    }    
    
}
