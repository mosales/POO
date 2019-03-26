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
public class Analgesico extends Producto implements Controlado{
    
    private int Mililitros;
    private String DiaOferta;

    public Analgesico(int Mililitros, String DiaOferta, String IdProducto, String Nombre, int Costo) {
        super(IdProducto, Nombre, Costo);
        this.Mililitros = Mililitros;
        this.DiaOferta = DiaOferta;
    }

    public int getMililitros() {
        return Mililitros;
    }

    public String getDiaOferta() {
        return DiaOferta;
    }

    public void setDiaOferta(String DiaOferta) {
        this.DiaOferta = DiaOferta;
    }

    @Override
    public String EsControlado() {
    return ("No Controlado");    
    }
    
    
    
}
