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
public class BarbedWireCollection implements Iterable
{
    private ArrayList<String> wires;

    public BarbedWireCollection()
    {
        wires = new ArrayList<>();
        wires.add("Strange 1");
        wires.add("Strange 2");
        wires.add("Strange 31");
        wires.add("Nato");
        wires.add("Nato 4");
        wires.add("Alien 1");
    }

    
    @Override
    public Iterator getIterator()
    {
        return new WireIterator(this);
    }

    public ArrayList<String> getWires()
    {
        return wires;
    }
    
    
    
    
}
