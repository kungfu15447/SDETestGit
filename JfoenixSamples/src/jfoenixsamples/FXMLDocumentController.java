/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfoenixsamples;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXSlider;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.validation.NumberValidator;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Frederik Jensen
 */
public class FXMLDocumentController implements Initializable
{

    @FXML
    private JFXTextField txtSecond;
    @FXML
    private JFXTextField txtFirst;
    @FXML
    private JFXButton btnClickMe;
    @FXML
    private Label lblBilbo;
    @FXML
    private JFXSlider slAdjustMe;

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        NumberValidator nv = new NumberValidator("Error: not a number");
        txtFirst.getValidators().add(nv);

        txtFirst.textProperty().addListener((observable, oldValue, newValue)
                ->
        {
            txtFirst.validate();
        });

        txtFirst.textProperty().bindBidirectional(txtSecond.textProperty());
        lblBilbo.textProperty().bindBidirectional(txtFirst.textProperty());

    }

    @FXML
    private void handleClickMe(ActionEvent event)
    {
        lblBilbo.setText("");
        Thread t = new Thread(() ->
        {
            simulateToughWork();
        });

        t.start();
        //lblBilbo.setText("Woke");
    }

    private void simulateToughWork()
    {
        try
        {
            Thread.sleep(5000);
            Platform.runLater(() ->
            {
                lblBilbo.setText("Done working");
            });
        } catch (Exception e)
        {

        }
    }

}
