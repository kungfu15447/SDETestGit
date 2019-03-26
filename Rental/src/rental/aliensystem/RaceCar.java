/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rental.aliensystem;

/**
 *
 * @author Frederik Jensen
 */
public class RaceCar 
{
    private double pricing;
    private double motorsize;
    private String make;
    private String model;

    public RaceCar(double pricing, double motorsize, String make, String model)
    {
        this.pricing = pricing;
        this.motorsize = motorsize;
        this.make = make;
        this.model = model;
    }
    
    public double getPricing()
    {
        return pricing;
    }

    public void setPricing(double pricing)
    {
        this.pricing = pricing;
    }

    public double getMotorsize()
    {
        return motorsize;
    }

    public void setMotorsize(double motorsize)
    {
        this.motorsize = motorsize;
    }

    public String getMake()
    {
        return make;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }
    
    
    
}
