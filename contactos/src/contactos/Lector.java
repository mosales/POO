/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import misclases.Amigo;

/**
 *
 * @author PC-14
 */
public class Lector {
    
     public static void main(String[] args){
         System.out.println("Lector de Amigos");
         ArrayList<Amigo> datos = new ArrayList<Amigo>();
         
         try{
         FileReader fr = new FileReader("Amigos.Unicorn");
         BufferedReader lector = new BufferedReader(fr);
         int NumC = Integer.valueOf(lector.readLine());
         for(int i=0; i<NumC; i++){
             String ID = lector.readLine();
             String Nombre = lector.readLine();
             String ApellP = lector.readLine();
             String ApellM = lector.readLine();
             String TelCasa = lector.readLine();
             String TelCel = lector.readLine();
             Amigo temp = new Amigo(ID, Nombre, ApellP, ApellM, TelCasa, TelCel);
             datos.add(temp);
         }
                 
         
         }catch(FileNotFoundException e){
             System.out.println("El archivo no existe");
         }catch(IOException e){
             System.out.println("Archivo Corrupto");
         }
         
         System.out.println("Termine");
         
     }
     
     
     
}
