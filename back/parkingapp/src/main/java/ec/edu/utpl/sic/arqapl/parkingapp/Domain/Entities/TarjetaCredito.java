/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.sic.arqapl.parkingapp.Domain.Entities;

import ec.edu.utpl.sic.arqapl.parkingapp.Domain.Intefaces.IMetododePago;

/**
 *
 * @author ESCRITORIO
 */
public class TarjetaCredito implements IMetododePago{
   private int id;
    private int valor;

   

    @Override
    public void Metodo() {
        System.out.println("el metodo que usted eligio como pago es  Credito");
    } 
}
