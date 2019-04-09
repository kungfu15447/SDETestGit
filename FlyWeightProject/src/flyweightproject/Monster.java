/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweightproject;

import javafx.scene.image.Image;


/**
 *
 * @author Frederik Jensen
 */
public class Monster
{
    private Image look;
    private String specie;
    private String name;
    private double size;
    
    public Monster(Image look, String specie) {
        this.look = look;
        this.specie = specie;
    }

    public Image getLook()
    {
        return look;
    }

    public void setLook(Image look)
    {
        this.look = look;
    }

    public String getSpecie()
    {
        return specie;
    }

    public void setSpecie(String specie)
    {
        this.specie = specie;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getSize()
    {
        return size;
    }

    public void setSize(double size)
    {
        this.size = size;
    }
    
    
}
