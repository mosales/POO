/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploex;

/**
 *
 * @author PC-14
 */
public class MenordeEdad extends Exception{
    private String Message;

    public MenordeEdad() {
        Message="El usuario es menor de edad";
    }

    public String getMessage() {
        return Message;
    }
    
    
    
    
}
