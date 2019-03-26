/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploex;

import java.util.InputMismatchException;
import java.util.Scanner;
import misclases.Persona;

/**
 *
 * @author PC-14
 */
public class EjemploEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        String Id;
        System.out.println("Dame ID");
        Id= scan.nextLine();
        
        String nom;
        System.out.println("Dame Nombre");
        nom = scan.nextLine();
        
        int edad;
        boolean error =false;
        do{
        edad=0;
        try{
        System.out.println("Dame edad");
        scan = new Scanner(System.in);
        edad = scan.nextInt();
        error =false;
        }
        catch(InputMismatchException e){
            System.out.println("No capturaste un Numero!!!!");
            error=true;
        }
        }while(error ==true);
        
        Persona p = new Persona(Id, nom, edad);
        System.out.println("Persona capturada");
        System.out.println(p.getID());
        System.out.println(p.getNombre());
        System.out.println(p.getEdad());
        
    }
    
}
