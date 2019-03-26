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
public class Juguete extends Exportacion{
    
    private int Edad;
    private boolean TienePlomo;

    public Juguete(int Edad, boolean TienePlomo, String IdProducto, int Piezas, String Descripcion) {
        super(IdProducto, Piezas, Descripcion);
        this.Edad = Edad;
        this.TienePlomo = TienePlomo;
    }

    
}
