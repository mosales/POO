/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2_calculadora2;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author mdeni
 */
public class JavaFXApplication2_Calculadora2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        FXMLLoader LectorPrimario = new FXMLLoader(getClass().getResource("Calcul2.fxml"));
        AnchorPane principal = null;
        try{
            principal = (AnchorPane) LectorPrimario.load();
        }catch(IOException e){
            System.out.println("El FXML no existe");
        }
        
    
        Calcul2Controller CalControl = LectorPrimario.getController();
        Scene escena = new Scene(principal);
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
