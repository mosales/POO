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
        
        int elementos;
        Scanner scan=new Scanner(System.in);
        int arreglo[];
        System.out.println("ingrese el numero de elementos");
        elementos=scan.nextInt();
        
        arreglo =new int[elementos];
        
        
        arreglo[0]=0;
        arreglo[1]=1;
        
        System.out.println("Serie Fibonacci: \n");
        for(int i=2;i<elementos;i++)
        {
         arreglo[i]=arreglo[i-2]+arreglo[i-1];
        }
        
            for(int p=0;p<elementos;p++)
            {
                System.out.println(arreglo[p]);
            }
        
    
    }   
    
    
}
