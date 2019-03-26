/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rental.be;

/**
 *
 * @author Frederik Jensen
 */
public abstract class RentItem
{
    private double price;
    private double milage; // km/L
    
    public abstract double calculatedPrice(); // based on type of item
    
    public RentItem(double price, double milage) {
        this.price = price;
        this.milage = milage;
    }

    public double getPrice()
    {
        return price;
    }

    public double getMilage()
    {
        return milage;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setMilage(double milage)
    {
        this.milage = milage;
    }
    
    
}
