/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumnos_Promedio;

import Mis_Clases.Alumno;

/**
 *
 * @author mdeni
 */
public class Alumnos_promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno jose = new Alumno("Jose", "1234");
        jose.set_Cal1((float)7.0);
        jose.set_Cal2((float)5.0);
        jose.set_Cal3((float)7.0);
        
        System.out.println("El alumno: "+ jose.informa());
        
        Alumno monica = new Alumno("Monica", "203633");
        monica.set_Cal1((float)9.0);
        monica.set_Cal2((float)8.0);
        monica.set_Cal3((float)7.0);
        
        System.out.println("El alumno: "+ monica.informa());
        
        
        
    }
    
}
