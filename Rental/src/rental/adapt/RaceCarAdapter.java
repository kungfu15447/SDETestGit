/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rental.adapt;

import rental.aliensystem.RaceCar;
import rental.be.RentItem;

/**
 *
 * @author Frederik Jensen
 */
public class RaceCarAdapter extends RentItem
{
    RaceCar rc;

    public RaceCarAdapter(RaceCar rc)
    {
        super(rc.getPricing()*1.25, 2/rc.getMotorsize());
    }
    
    @Override
    public double calculatedPrice()
    {
        return getPrice()*1.1;
    }
    
}
