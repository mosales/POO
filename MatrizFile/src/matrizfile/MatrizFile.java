/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizfile;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author PC-14
 */
public class MatrizFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int filas=0;
        int columnas=0;
        Scanner scan=null;
        scan = new Scanner(System.in);
        System.out.println("Dime Filas");
        filas = scan.nextInt();
        System.out.println("Dime Columnas");
        columnas = scan.nextInt();
        scan = new Scanner(System.in);
        int datos[][] = new int[filas][columnas];
        for(int i=0; i< filas; i++)
            for(int j=0;j<columnas; j++){
                System.out.printf("Dame el elmento %d Filas, %d Columnas \n",i+1,j+1);
                datos[i][j]=scan.nextInt();
            }
        
        try{
        FileOutputStream fos= new FileOutputStream("matriz.Unicorn");
        DataOutputStream escritor = new DataOutputStream(fos);
        escritor.writeInt(filas);
        escritor.writeInt(columnas);
        for(int i=0; i< filas; i++)
            for(int j=0;j<columnas; j++){
                escritor.writeInt(datos[i][j]);
            }
        escritor.close();
        }catch(IOException e){
            System.out.println("Error al hacer archivo");
        }
        
        System.out.println("Programa terminado");
        
    }
    
}
