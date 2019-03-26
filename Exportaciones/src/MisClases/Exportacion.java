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
public class Exportacion implements Explicate{
    
    private String IdProducto;
    private int Piezas;
    private String Descripcion;

    public Exportacion(String IdProducto, int Piezas, String Descripcion) {
        this.IdProducto = IdProducto;
        this.Piezas = Piezas;
        this.Descripcion = Descripcion;
    }

    @Override
    public String DameDescripcion() {
        return Descripcion;
    }
    
    
    
}
