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
public class Amigo {
    private String ID;
    private String Nombre;
    private String ApellidoP;
    private String ApellidoM;
    private String TelCasa;
    private String TelCelular;

    public Amigo(String ID, String Nombre, String ApellidoP, String ApellidoM, String TelCasa, String TelCelular) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.ApellidoP = ApellidoP;
        this.ApellidoM = ApellidoM;
        this.TelCasa = TelCasa;
        this.TelCelular = TelCelular;
    }

    public String getID() {
        return ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidoP() {
        return ApellidoP;
    }

    public String getApellidoM() {
        return ApellidoM;
    }

    public String getTelCasa() {
        return TelCasa;
    }

    public String getTelCelular() {
        return TelCelular;
    }
    
    
    
}
