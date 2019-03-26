/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2_b;
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
       
       int p;
       float numeros[]=new float[5];
       Scanner scan= new Scanner(System.in);
       float temp;
       
       System.out.println("Ingrese 5 numeros");
       
       for (int i=0;i<5;i++)
        {
            numeros[i]=scan.nextFloat();
        }
       
         for (int i=0;i<5;i++)
         {
            for (int j=0;j<4;j++)
            {
                 if(numeros[j] > numeros[j+1])
                 {
                 temp=numeros[j];
                 numeros[j]=numeros[j+1];
                 numeros[j+1]=temp;
                 }
            }
         }
       
      
      System.out.println("El arreglo ordenado es:\n");
        for(p=0;p<5;p++){
            System.out.println(numeros[p]);
        
        }
       
    
    
}}
