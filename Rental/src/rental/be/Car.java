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
public class Car extends RentItem
{

    public Car(double price, double milage)
    {
        super(price, milage);
    }

    @Override
    public double calculatedPrice()
    {
        return getPrice()*1.0;
    }
    
}
