/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithsorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Frederik Jensen
 */
public class FunWithSorting
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Comparator<Car> byBrand = (Car car1, Car car2) -> car1.getBrand().compareTo(car2.getBrand());
        Comparator<Car> byColor = (Car car1, Car car2) -> car1.getColor().compareTo(car2.getColor());
        Comparator<Car> byTopSpeed = (Car car1, Car car2) -> car1.getTopSpeed() - car2.getTopSpeed();
        
        
        
        Car c1 = new Car("VW", "Golf GTW", "blue", 215);
        Car c2 = new Car("Peugeot", "308 SW", "reeeally green", 207);
        Car c3 = new Car("BMW", "320i", "black", 212);
        Car c4 = new Car("Tesla", "Model S", "red", 250);

        Car[] carArray = new Car[4];
        
        carArray[0] = c1;
        carArray[1] = c2;
        carArray[2] = c3;
        carArray[3] = c4;
        
        Arrays.sort(carArray, Collections.reverseOrder(byTopSpeed));
        
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);

        System.out.println("Arrays.sort()...");
        for (Car c : carArray)
        {
            System.out.println(c);
        }

        //Pre Java 8.
        CarComparatorBrand carSortBrand = new CarComparatorBrand();

        //Java -Lambda Expression
        /*{

            if (car1.getTopSpeed() < car2.getTopSpeed())
            {
                return -1;
            } else if (car1.getTopSpeed() > car2.getTopSpeed())
            {
                return 1;
            } else
            {
                return 0;
            }
            
            //return car1.getTopSpeed() - car2.getTopSpeed();
        };*/

        Collections.sort(cars, byTopSpeed);

        System.out.println("After sort...");
        for (Car c : cars)
        {
            System.out.println(c);
        }
    }

}
