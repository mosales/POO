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
public class Antibiotico extends Producto implements Controlado{
    private String Presentacion;

    public Antibiotico(String Presentacion, String IdProducto, String Nombre, int Costo) {
        super(IdProducto, Nombre, Costo);
        this.Presentacion = Presentacion;
    }

    public String getPresentacion() {
        return Presentacion;
    }

    public void setPresentacion(String Presentacion) {
        this.Presentacion = Presentacion;
    }

    @Override
    public String EsControlado() {
           return super.getNombre(); 
    }

    
    
}
