/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploex2;

import java.util.InputMismatchException;
import java.util.Scanner;
import misclases.MenordeEdad;
import misclases.Usuario;

/**
 *
 * @author PC-14
 */
public class EjemploEx2 {

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
        if(edad <18)
            throw new MenordeEdad();
        error =false;
        
        }
        catch(InputMismatchException e){
            System.out.println("No capturaste un Numero!!!!");
            error=true;
        }
        catch(MenordeEdad e){
            System.out.println(e.getMessage());
            error=true;
        }
        
        }while(error ==true);
        
        Usuario u = new Usuario(Id, nom, edad);
        System.out.println("Todo capturado bien!");
        System.out.println(u.getNombre());
        System.out.println(u.getID());
        System.out.println(u.getEdad());
    }
    
}
