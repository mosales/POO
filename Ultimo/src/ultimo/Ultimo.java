/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimo;

import java.io.IOException;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import misclases.Persona;

/**
 *
 * @author PC-14
 */
public class Ultimo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        ArrayList<Persona> datos = new ArrayList<Persona>();
        
        
        FXMLLoader lectorPrimario = new FXMLLoader(getClass().getResource("Principal.fxml"));
        BorderPane pborder= null;
        try{
            pborder = (BorderPane) lectorPrimario.load();
        }catch(IOException e){
            System.out.println("El FXML no se encontro");
        }
        
        PrincipalController principalCon = lectorPrimario.getController();
        principalCon.setDatos(datos);
        
        Scene escena = new Scene(pborder);
        primaryStage.setScene(escena);
        primaryStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
