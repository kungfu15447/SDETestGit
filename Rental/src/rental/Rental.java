/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rental;

import rental.adapt.RaceCarAdapter;
import rental.aliensystem.RaceCar;
import rental.be.Car;
import rental.be.RentItem;

/**
 *
 * @author Frederik Jensen
 */
public class Rental
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        RentItem ri = new RaceCarAdapter(new RaceCar(2500, 0.2, "Tesla", "Roadster"));
        RentItem ri2 = new Car(2410, 14);
        System.out.println("ri; " + ri.calculatedPrice());
    }
    
}
