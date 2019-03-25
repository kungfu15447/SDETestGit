/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

/**
 *
 * @author Frederik Jensen
 */
public class JavaCollections
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        PersonManagerQueue pm = PersonManagerQueue.getSingleInstance();
        
        Person Michael = new Person(1, "Michael", "18-01-1998");
        Person Steffen = new Person(2, "Steffen", "04-06-1980");
        Person Lotte = new Person(3, "Lotte", "06-09-1969");
        Person Jørgen = new Person(4, "Jørgen", "22-3-2000");
        Person Sofie = new Person(5, "Sofie", "15-6-2002");
        
        pm.addPersons(Michael, Steffen, Lotte, Jørgen, Sofie);
        
        System.out.println(" ");
        
        for (Person person : pm.getPersons()) { 
            System.out.println(person);
        }
        
        System.out.println(" ");
        System.out.println(pm.getNextPerson());
        System.out.println(" ");
        
        for (Person person : pm.getPersons()) { 
            System.out.println(person);
        }
        
        System.out.println(" ");
        
        System.out.println(pm.whoIsNext());
        
        System.out.println(" ");
    }
    
}
