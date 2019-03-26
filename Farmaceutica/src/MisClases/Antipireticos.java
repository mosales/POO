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
public class Antipireticos extends Producto implements Controlado{
    
    private boolean Combinado;
    private String NomLaboratorio;

    public Antipireticos(boolean Combinado, String NomLaboratorio, String IdProducto, String Nombre, int Costo) {
        super(IdProducto, Nombre, Costo);
        this.Combinado = Combinado;
        this.NomLaboratorio = NomLaboratorio;
    }

    public boolean getCombinado() {
        return Combinado;
    }

    public String getNomLaboratorio() {
        return NomLaboratorio;
    }

    public void setNomLaboratorio(String NomLaboratorio) {
        this.NomLaboratorio = NomLaboratorio;
    }

    @Override
    public String EsControlado() {
        return ("No Controlado");  
    }
    
    
    
    
}
