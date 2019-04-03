/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectpoolgameexample;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javafx.scene.image.Image;

/**
 *
 * @author Frederik Jensen
 */
public class RockPool
{

    private List<Rock> rocks = new CopyOnWriteArrayList<>();
    private Deque<Rock> released = new ArrayDeque();

    private static RockPool instance;

    public static RockPool getInstance()
    {
        if (instance == null)
        {
            instance = new RockPool();
        }
        return instance;
    }

    private RockPool()
    {

    }

    public void release(Rock rock)
    {
        rocks.remove(rock);
        released.add(rock);
    }

    public void createRock(double x, double y, double speed, double direction, String imagePath, int imageHeight, int imageWidth)
    {
        System.out.println("Rocks: " + rocks.size());
        System.out.println("Released: " + released.size());
        Rock rock;
        if (released.isEmpty())
        {
            if (rocks.size() >= 50) {
                released.add(rocks.get(rocks.size()-1));
            } else {
            Image imgRock = new Image(imagePath, imageHeight, imageWidth, true, true);
            rock = new Rock(x, y, imgRock, speed, direction);
            rocks.add(rock);
            }
        } else
        {
            rock = released.poll();
            rock.setDirection(direction);
            rock.setSpeed(speed);
            rock.setX(x);
            rock.setY(y);
            rocks.add(rock);
        }
    }

    public List<Rock> getRocks()
    {
        return rocks;
    }
}
