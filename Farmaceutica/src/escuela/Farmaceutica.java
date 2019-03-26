/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuela;

import MisClases.Analgesico;
import MisClases.Antibiotico;
import MisClases.Antipireticos;

/**
 *
 * @author mdeni
 */
public class Farmaceutica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Antibiotico b1 = new Antibiotico("pastillas", "15155", "Amoxicilina", 150);
        Analgesico g1 = new Analgesico(150, "Lunes", "161616", "Naproxen", 45);
        Antipireticos p1 = new Antipireticos(true, "Pfziger","171717" , "Naxipilna", 300);
        
        
        System.out.println(b1.EsControlado());
        System.out.println(g1.EsControlado());
        System.out.println(p1.EsControlado());
        
        
    }
    
}
