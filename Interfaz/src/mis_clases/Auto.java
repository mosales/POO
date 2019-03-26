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
public class Auto  extends vehiculo{
    
    private String Cobertura;
    private String NoMotor;

    public Auto(String Cobertura, String NoMotor, String Placa, String Conductor) {
        super(Placa, Conductor);
        this.Cobertura = Cobertura;
        this.NoMotor = NoMotor;
    }
    
    
    
}
