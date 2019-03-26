/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_a;

import java.util.Random;
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
        
        
        float num1, num2;
        float suma, resta, multiplicacion, division;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("inserte numero 1");
        num1=teclado.nextFloat();
        System.out.println("inserte numero 2");
        num2=teclado.nextFloat();
        
        suma=num1+num2;
        resta=num1-num2;
        multiplicacion=num1*num2;
        division=num1/num2;
        
        System.out.println("la suma es:"+suma);
        System.out.println("la resta es:"+resta);
        System.out.println("la multiplicacion es:"+multiplicacion);
        System.out.println("la division es:"+division);
        
            }
    
}
