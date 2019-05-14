/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2_calculadora2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author mdeni
 */
public class Calcul2Controller implements Initializable {

    @FXML
    private Label labResultado;
    @FXML
    private TextField txtNum1;
    @FXML
    private TextField txtNum2;
    @FXML
    private Button btnSuma;
    @FXML
    private Button btnResta;
    @FXML
    private Button btnMultiplicacion;
    @FXML
    private Button btnDivision;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML 
    private void Suma(){
    float num1 =Float.parseFloat(txtNum1.getText());
    float num2 =Float.parseFloat(txtNum2.getText());
    
    float res = num1 + num2;
    labResultado.setText(String.valueOf(res));
    }
    
    @FXML 
    private void Resta(){
    float num1 =Float.parseFloat(txtNum1.getText());
    float num2 =Float.parseFloat(txtNum2.getText());
    
    float res = num1 - num2;
    labResultado.setText(String.valueOf(res));
    }
    
    @FXML 
    private void Multiplicacion(){
    float num1 =Float.parseFloat(txtNum1.getText());
    float num2 =Float.parseFloat(txtNum2.getText());
    
    float res = num1 * num2;
    labResultado.setText(String.valueOf(res));
    }
    
    @FXML 
    private void Division(){
    float num1 =Float.parseFloat(txtNum1.getText());
    float num2 =Float.parseFloat(txtNum2.getText());
    
    float res = num1 / num2;
    if(num2==0){
    labResultado.setText("Error en la Division");
    }
    labResultado.setText(String.valueOf(res));
    }
    
}
