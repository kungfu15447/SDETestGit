/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectpoolgameexample;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Frederik Jensen
 */
public class MainController implements Initializable
{

    @FXML
    private AnchorPane mainPane;

    List<Rock> rocks = new ArrayList<>();
    List<String> imagesURLS = new ArrayList<>();

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        Canvas canvas = new Canvas(800, 600);
        mainPane.getChildren().add(canvas);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Image imgBg = new Image("bg.jpg");
        imagesURLS.add("beegyoshi.jpg");
        imagesURLS.add("apple.jpg");
        imagesURLS.add("rock.jpg");
        
        Random rand = new Random();
        AnimationTimer t = new AnimationTimer()
        {
            @Override
            public void handle(long now)
            {
                RockPool.getInstance().createRock(rand.nextInt((int) canvas.getWidth()),
                        rand.nextInt(200), 10, Math.PI / 2, 
                        imagesURLS.get(rand.nextInt(imagesURLS.size())), 75, 75);
                gc.drawImage(imgBg, 0, 0);
                for (Rock rock : RockPool.getInstance().getRocks())
                {
                    rock.move();
                    gc.drawImage(rock.getImg(), rock.getX(), rock.getY());
                    if (rock.getX() < 0 || rock.getX() > canvas.getWidth()
                            || rock.getY() < 0 || rock.getY() > canvas.getHeight())
                    {
                        RockPool.getInstance().release(rock);
                    }
                }

            }
        };
        t.start();
    }

}
