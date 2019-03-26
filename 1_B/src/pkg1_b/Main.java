/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_b;

import java.util.Scanner;

/**
 *
 * @author mdeni
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un Nombre:");
        nombre=teclado.nextLine();
        
        System.out.println("\n");
        for(int i=0; i<5 ;i++){
                System.out.println(""+nombre);
            }
                
        
        
    }
    
}
