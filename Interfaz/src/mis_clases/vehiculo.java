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
public class vehiculo implements Accidentar{
    
    private String Placa;
    private String Conductor;

    public vehiculo(String Placa, String Conductor) {
        this.Placa = Placa;
        this.Conductor = Conductor;
    }

    @Override
    public String DamePlaca() {
        return Placa;
        
    }
    
    
    
}
