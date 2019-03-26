/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

/**
 *
 * @author mdeni
 */
public class Producto {
    
    private String IdProducto;
    private String Nombre;
    private int Costo;

    public Producto(String IdProducto, String Nombre, int Costo) {
        this.IdProducto = IdProducto;
        this.Nombre = Nombre;
        this.Costo = Costo;
    }

    public String getIdProducto() {
        return IdProducto;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getCosto() {
        return Costo;
    }
    
   
    
}
