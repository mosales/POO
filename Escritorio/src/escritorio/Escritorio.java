/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escritorio;

import Graficas.Principal;
import misclases.Persona;

/**
 *
 * @author PC-14
 */
public class Escritorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona amigo = new Persona();
        
        Principal pinit = new Principal();
        pinit.setDatos(amigo);
        pinit.setVisible(true);
        
    }
    
}
