/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import misclases.Amigo;

/**
 *
 * @author PC-14
 */
public class Contactos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan;
        boolean continuar =false;
        ArrayList<Amigo> datos = new ArrayList<Amigo>();
        do{
            scan = new Scanner(System.in);
            System.out.println("Dame ID");
            String Id = scan.nextLine();
            System.out.println("Dame Nombre");
            String Nombre = scan.nextLine();
            System.out.println("Dame Apellido P");
            String ApellidoP = scan.nextLine();
            System.out.println("Dame Apellido M");
            String ApellidoM = scan.nextLine();
            System.out.println("Dame Tel Casa");
            String TelCasa = scan.nextLine();
            System.out.println("Dame Tel Celular");
            String TelCelular = scan.nextLine();
            Amigo temp = new Amigo(Id, Nombre, ApellidoP, ApellidoM, TelCasa, TelCelular);
            datos.add(temp);
           
            System.out.println("Deseas Continuar?");
            System.out.println("0.....no");
            System.out.println("1.....Si");
            scan = new Scanner(System.in);
            int tempInt = scan.nextInt();
            continuar= tempInt==1? true:false;
        }while(continuar);
        
        //generando Archivo
        try{
        FileWriter fw = new FileWriter("Amigos.Unicorn");
        PrintWriter escritor = new PrintWriter(fw);
        escritor.println(datos.size());
        for(int i=0; i< datos.size(); i++){
            Amigo temp = datos.get(i);
            escritor.println(temp.getID());
            escritor.println(temp.getNombre());
            escritor.println(temp.getApellidoP());
            escritor.println(temp.getApellidoM());
            escritor.println(temp.getTelCasa());
            escritor.println(temp.getTelCelular());
        }
        escritor.close();
        }catch(IOException e){
            System.out.println("No se puede crear el archivo");
        }
        
        System.out.println("FIN archivo Guardado");
    }
    
}
