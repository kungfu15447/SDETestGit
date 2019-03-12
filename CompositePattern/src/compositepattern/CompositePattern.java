/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepattern;

/**
 *
 * @author Frederik Jensen
 */
public class CompositePattern
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
        Genre action = new Genre("Action");
        Genre subComedy = new Genre("Comedy");
        Genre subRomance = new Genre("Romance");
        Genre horror = new Genre("Horror");
        Movie deadpool = new Movie("Deadpool");
        Movie deadpool2 = new Movie("Deadpool 2");
        Movie actionMovie = new Movie("Badass Movie");
        action.add(subRomance);
        action.add(subComedy);
        subComedy.add(deadpool);
        subComedy.add(deadpool2);
        action.add(actionMovie);
        subRomance.add(horror);
        action.is();
        
    }
    
}
