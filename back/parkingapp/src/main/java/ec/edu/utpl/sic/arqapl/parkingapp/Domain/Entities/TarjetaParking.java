package ec.edu.utpl.sic.arqapl.parkingapp.Domain.Entities;

import ec.edu.utpl.sic.arqapl.parkingapp.Domain.Intefaces.IMetododePago;

/**
 *
 * @author ESCRITORIO
 */
public class TarjetaParking implements IMetododePago{
    private int id;
    private int valor;

  
    @Override
    public void Metodo() {
        System.out.println("el metodo que usted eligio como pago es  Tarjeta de Parqueadero");
    }
    
}
