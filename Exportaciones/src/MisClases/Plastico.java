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
public class Plastico extends Exportacion {
    
    private String Color;
    private boolean RecomMicro;

    public Plastico(String Color, boolean RecomMicro, String IdProducto, int Piezas, String Descripcion) {
        super(IdProducto, Piezas, Descripcion);
        this.Color = Color;
        this.RecomMicro = RecomMicro;
    }
    
    
    
}
