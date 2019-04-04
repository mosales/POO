/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizfile;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author PC-14
 */
public class Lectora {
    
     public static void main(String[] args){
        
         int filas=0;
         int columnas=0;
         int datos[][]= new int[0][0];
         
         try{
         FileInputStream fis = new FileInputStream("matriz.Unicorn");
         DataInputStream lector = new DataInputStream(fis);
         filas = lector.readInt();
         columnas = lector.readInt();
         datos = new int[filas][columnas];
         for(int i=0; i< filas; i++)
             for(int j=0; j< columnas; j++){
                 datos[i][j]= lector.readInt();
             }
         
         lector.close();
         
         }catch(FileNotFoundException error){
             System.out.println("No existe el archivo");
         }catch(IOException error){
             System.out.println("Archivo Corrupto");
         }
         
      
         System.out.println("Programa Exitoso");
         
         
     }
    
}
