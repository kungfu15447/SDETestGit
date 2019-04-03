/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithsorting;

import java.util.Comparator;

/**
 *
 * @author Frederik Jensen
 */
public class CarComparatorBrand implements Comparator<Car> 
{

    @Override
    public int compare(Car t, Car t1)
    {
        return t.getBrand().compareTo(t1.getBrand());
    }
       
}
