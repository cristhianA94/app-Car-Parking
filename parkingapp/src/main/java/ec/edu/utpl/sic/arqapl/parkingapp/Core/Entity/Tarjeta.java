package ec.edu.utpl.sic.arqapl.parkingapp.Core.Entity;

/**
 *
 * @author Crist_Apolo
 */
public class Tarjeta {
    
    private int idTarjeta;
    private float saldo;

    public Tarjeta() {
    }

    public Tarjeta(int idTarjeta, float saldo) {
        this.idTarjeta = idTarjeta;
        this.saldo = saldo;
    }

    
    //Metodos
    
    public int getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(int idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void recargarSaldo(){
        
    }
    
    public void consultarSaldo(){
        
    }
    
    public void pagar(){
    
    }
    
    
    @Override
    public String toString() {
        return "Tarjeta{" + "idTarjeta=" + idTarjeta + ", saldo=" + saldo + '}';
    }
    
    
    
}
