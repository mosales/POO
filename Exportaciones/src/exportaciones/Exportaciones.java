/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exportaciones;

import MisClases.Explicate;
import MisClases.Juguete;
import MisClases.Plastico;

/**
 *
 * @author mdeni
 */
public class Exportaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        Explicate[] Contenedor = new Explicate [3];
        
        Contenedor[0] = new Juguete(5, true, "ju5478", 5,"Figura de accion");
        Contenedor[1] = new Juguete(6, true, "juhkjhk", 10, "Rompe cabezas");
        Contenedor[2] = new Plastico("verde", true, "jhhjga888", 47, "Tupper mediano");
        
        for (int i = 0; i <3 ; i++) {
            
            System.out.println(Contenedor[i].DameDescripcion());
            
        }
    
    }
    
}
