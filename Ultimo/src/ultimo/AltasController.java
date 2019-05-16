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
import javafx.scene.control.TextField;
import misclases.Persona;

/**
 * FXML Controller class
 *
 * @author PC-14
 */
public class AltasController implements Initializable {

    private ArrayList<Persona> datos;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellido;
    @FXML
    private TextField txtTelefono;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public void setDatos(ArrayList<Persona> datos) {
        this.datos = datos;
    }
    
    @FXML
    private void guardar(){
        String nombre = txtNombre.getText();
        String Ap = txtApellido.getText();
        String tel = txtTelefono.getText();
        
        Persona amigo = new Persona();
        amigo.setNombre(nombre);
        amigo.setApPaterno(Ap);
        amigo.setTelefono(tel);
        
        this.datos.add(amigo);
        
        txtNombre.setText("");
        txtApellido.setText("");
        txtTelefono.setText("");
        
    }
    
}
