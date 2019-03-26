/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misclases;

/**
 *
 * @author PC-14
 */
public class Persona {
    private String ID;
    private String Nombre;
    private int Edad;

    public Persona(String ID, String Nombre, int Edad) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public String getID() {
        return ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return Edad;
    }
    
    
    
    
    
}
