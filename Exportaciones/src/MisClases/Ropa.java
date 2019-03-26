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
public class Ropa extends Exportacion{
    
    private boolean ParaMujer;

    public Ropa(boolean ParaMujer, String IdProducto, int Piezas, String Descripcion) {
        super(IdProducto, Piezas, Descripcion);
        this.ParaMujer = ParaMujer;
    }
    
    
    
}
