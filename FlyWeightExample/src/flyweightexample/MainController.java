/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweightexample;

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
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Frederik
 */
public class MainController implements Initializable {

    @FXML
    private AnchorPane mainPane;
    @FXML
    private Button button;
    Canvas canvas;
    GraphicsContext gc;
    @FXML
    private Button button1;

    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
    }

    private int getRandSize(Random rand) {
        return (rand.nextInt(2) + 1) * 15;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        canvas = new Canvas(800, 560);
        mainPane.getChildren().add(canvas);
        gc = canvas.getGraphicsContext2D();

    }

    @FXML
    private void yesFlyWClicked(ActionEvent event) {
        Random rand = new Random();
        LadybugFactory fact = new LadybugFactory("ladybug.png");
        long start = System.nanoTime();
        
        for (int i = 0; i < 1_000; i++) {
            int size = getRandSize(rand);
            int locationX = rand.nextInt((int) canvas.getWidth());
            int locationY = rand.nextInt((int) canvas.getHeight() - 40);
            Ladybug lb = fact.create(size);
            gc.drawImage(lb.getImg(), locationX, locationY);
        }
        
        long end = System.nanoTime();

        System.out.println("Time : " + (end - start) / 1_000_000 + " ms");
    }

    @FXML
    private void noFlyWClicked(ActionEvent event) {
        Random rand = new Random();
        long start = System.nanoTime();
        
        for (int i = 0; i < 1_000; i++) {
            int size = getRandSize(rand);
            int locationX = rand.nextInt((int) canvas.getWidth());
            int locationY = rand.nextInt((int) canvas.getHeight() - 40);
            Image image = new Image("ladybug.png", size, size, true, true);
            gc.drawImage(image, locationX, locationY);
        }
        
        long end = System.nanoTime();

        System.out.println("Time : " + (end - start) / 1_000_000 + " ms");
    }

    @FXML
    private void handleClearCanvas(ActionEvent event) {
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }

}
