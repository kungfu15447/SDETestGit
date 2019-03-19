/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpatternrpg.reciever;

/**
 *
 * @author Frederik Jensen
 */
public abstract class Avatar
{
    private double health;
    private double shield;
    private String name;

    public Avatar(double health, double shield, String name)
    {
        this.health = health;
        this.shield = shield;
        this.name = name;
    }

    public double getHealth()
    {
        return health;
    }

    public double getShield()
    {
        return shield;
    }

    public String getName()
    {
        return name;
    }

    public void setHealth(double health)
    {
        this.health = health;
    }

    public void setShield(double shield)
    {
        this.shield = shield;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    
}
