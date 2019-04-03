/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithsorting;

/**
 *
 * @author Frederik Jensen
 */
public class Car implements Comparable<Car>
{
    private String brand;
    private String model;
    private String color;
    private int topSpeed;

    public Car(String brand, String model, String color, int topSpeed)
    {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.topSpeed = topSpeed;
    }

    
    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public int getTopSpeed()
    {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed)
    {
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString()
    {
        return "Car{" + "brand=" + brand + ", model=" + model + ", color=" + color + ", topSpeed=" + topSpeed + '}';
    }

    @Override
    public int compareTo(Car other)
    {
        return this.brand.compareTo(other.brand);
    }
    
}
