/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lommeregner;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Frederik
 */
public class CalculatorController implements Initializable {

    @FXML
    private TextField txtHeight;
    @FXML
    private TextField txtWidth;
    @FXML
    private TextField txtLength;
    @FXML
    private TextField txtVolume;
    @FXML
    private Button btnCalculate;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleCalculate(ActionEvent event) {
    }
    
}
