/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweightproject;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Frederik Jensen
 */
public class FXMLDocumentController implements Initializable
{
    
    @FXML
    private Button button;
    @FXML
    private AnchorPane mainPane;
    Canvas canvas;
    GraphicsContext gc;
    Random rand;
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        canvas = new Canvas(800, 560);
        mainPane.getChildren().add(canvas);
        gc = canvas.getGraphicsContext2D();
        rand = new Random();
    }    

    @FXML
    private void handleSpawnMonsters(ActionEvent event)
    {
        MonsterFactory mf = new MonsterFactory();
        
        for (int i = 0; i < 1_000; i++) {
            int locationX = rand.nextInt((int) canvas.getWidth());
            int locationY = rand.nextInt((int) canvas.getHeight() - 40);
            Monster monster = mf.getMonster("jagras");
            monster.setName("Dingleberg");
            monster.setSize(rand.nextInt(1500)+1000);
            gc.drawImage(monster.getLook(), locationX, locationY);
            
        }
        
    }
    
}
