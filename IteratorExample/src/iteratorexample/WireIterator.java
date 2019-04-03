/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorexample;

import java.util.ArrayList;

/**
 *
 * @author Frederik Jensen
 */
public class WireIterator implements Iterator
{
    private ArrayList<String> wires;
    private int currentIndex;

    public WireIterator(BarbedWireCollection bwc)
    {
        wires = bwc.getWires();
        currentIndex = -1;
    }
 
    @Override
    public boolean next()
    {
        currentIndex++;
        return currentIndex < wires.size();
    }

    @Override
    public Object currentItem()
    {
        return wires.get(currentIndex);
    }
    
}
