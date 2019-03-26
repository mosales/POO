/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import mis_clases.Auto;
import mis_clases.Moto;

/**
 *
 * @author mdeni
 */
public class Interfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Moto m1 = new Moto("Kawasaki", "150", "AB-12", "Monica");
        Auto a1 = new Auto("completa", "65456d65d56", "ABC-123", "Karlo");
        
        
        System.out.println(m1.DamePlaca());
        System.out.println(a1.DamePlaca());
    }
    
}
