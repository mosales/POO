/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1.c;

import java.util.Scanner;

/**
 *
 * @author PC-8
 */
public class Practica1C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        // TODO code application logic here
        float base,altura,triangulo,pentagono;
        System.out.println("Capture la Base y la Altura");
        base=teclado.nextFloat();
        altura=teclado.nextFloat();
        triangulo=(base*altura)/2;
        pentagono=(base*5)*(altura/2);
        System.out.println("Triangulo   "+triangulo);
        System.out.println("Pentagono   "+pentagono);
        
        
        
        
        
    }
    
}
