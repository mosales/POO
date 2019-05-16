/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimo;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import misclases.Persona;

/**
 * FXML Controller class
 *
 * @author PC-14
 */
public class PrincipalController implements Initializable {

    private ArrayList<Persona> datos;
    
    @FXML
    private BorderPane Border;
    @FXML
    private MenuItem btnAltas;

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
    private void muestraAltas(){
        this.Border.setCenter(null);
        FXMLLoader lectorPrimario = new FXMLLoader(getClass().getResource("Altas.fxml"));
        AnchorPane pAnchor= null;
        try{
            pAnchor = (AnchorPane) lectorPrimario.load();
        }catch(IOException e){
            System.out.println("El FXML no se encontro");
        }
        
        AltasController altasCon = lectorPrimario.getController();
        altasCon.setDatos(datos);
        this.Border.setCenter(pAnchor);
    }
    
    @FXML
    private void muestraVista(){
        this.Border.setCenter(null);
        FXMLLoader lectorPrimario = new FXMLLoader(getClass().getResource("Vista.fxml"));
        AnchorPane pAnchor= null;
        try{
            pAnchor = (AnchorPane) lectorPrimario.load();
        }catch(IOException e){
            System.out.println("El FXML no se encontro");
        }
        
        VistaController vistaCon = lectorPrimario.getController();
        vistaCon.setDatos(datos);
        this.Border.setCenter(pAnchor);
    }
}
