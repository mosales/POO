/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimo;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import misclases.Persona;

/**
 * FXML Controller class
 *
 * @author PC-14
 */
public class VistaController implements Initializable {

    private int dir = 0;
    private ArrayList<Persona> datos;
    @FXML
    private Label labNombre;
    @FXML
    private Label labAp;
    @FXML
    private Label labTel;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public void setDatos(ArrayList<Persona> datos) {
        this.datos = datos;
            Persona p = this.datos.get(dir);
            labNombre.setText(p.getNombre());
            labAp.setText(p.getApPaterno());
            labTel.setText(p.getTelefono());
    }
    
    @FXML
    private void avanza(){
        if(this.dir+1 < this.datos.size())
        {
            this.dir++;
            Persona p = this.datos.get(dir);
            labNombre.setText(p.getNombre());
            labAp.setText(p.getApPaterno());
            labTel.setText(p.getTelefono());
        }
        
    }
    
    @FXML
    private void atras(){
         if(this.dir-1 >= 0)
        {
            this.dir--;
            Persona p = this.datos.get(dir);
            labNombre.setText(p.getNombre());
            labAp.setText(p.getApPaterno());
            labTel.setText(p.getTelefono());
        }
    }
    
}
