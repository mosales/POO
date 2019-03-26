/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mis_clases;

/**
 *
 * @author mdeni
 */
public class Moto extends vehiculo {
    
    private String TipoCasco;
    private String CmMotor;

    public Moto(String TipoCasco, String CmMotor, String Placa, String Conductor) {
        super(Placa, Conductor);
        this.TipoCasco = TipoCasco;
        this.CmMotor = CmMotor;
    }

    
    
    
    
}
