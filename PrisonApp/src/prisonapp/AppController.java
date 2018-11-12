/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prisonapp;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import prisonapp.BE.Ansat;
import prisonapp.BE.Person;
import prisonapp.BE.Fængsel;
import prisonapp.BE.Indsat;
import prisonapp.BE.Person;

/**
 *
 * @author Frederik Jensen
 */
public class AppController implements Initializable
{

    @FXML
    private ComboBox<Fængsel> dropdownfængsler;
    @FXML
    private ListView<Indsat> listindsatte;
    @FXML
    private ListView<Ansat> listansatte;
    @FXML
    private TextArea txtoplysninger;
    @FXML
    private TextArea txthemmelig;
    @FXML
    private Label lblindsat;
    @FXML
    private Label lblfri;
    
    ArrayList<Fængsel> fængsler = new ArrayList();
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        createData();
    }
    
    private void createData() 
    {
        Fængsel fængsel = new Fængsel();
        
        Indsat a = new Indsat("230450-1765", "Piotre Stegre");
        Indsat b = new Indsat("170988-4321", "Pierre Steegher");
        
        fængsel.addIndsat(a);
        fængsel.addIndsat(b);
        
        Ansat ansat = new Ansat("210145-2342", "Petergine Steganosis");
        fængsel.addAnsat(ansat);
        
        listindsatte.getItems().addAll(fængsel.getIndsatte());
        listansatte.getItems().addAll(fængsel.getAnsatte());
    }

    @FXML
    private void clickFængsler(ActionEvent event)
    {
    }
    
}
