/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerhash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Frederik Jensen
 */
public class CustomerHash
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        /*HashMap<String, Customer> customers = new HashMap<>();
        HashSet<Customer> customersSet = new HashSet<>();
        
        Customer c1 = new Customer("89764529", "Company fuck", "Adresse 32", "enmail@mail.dk");
        Customer c2 = new Customer("23541243", "Company fuckshit", "Adresse 2", "tomail@mail.dk");
        Customer c3 = new Customer("28692869", "The compa", "Adresse 60", "tremail@mail.dk");
        Customer c4 = new Customer("12323454", "El facour", "Adresse 68", "firemail@mail.dk");
        Customer c5 = new Customer("00889765", "Firma?", "Adresse 22", "femmail@mail.dk");
        Customer c6 = new Customer("22332233", "Company fuck", "Adresse 32", "enmail@mail.dk");
        
        customers.put(c1.getPhonenumber(), c1);
        customers.put(c2.getPhonenumber(), c2);
        customers.put(c3.getPhonenumber(), c3);
        customers.put(c4.getPhonenumber(), c4);
        customers.put(c5.getPhonenumber(), c5);
        customers.put(c6.getPhonenumber(), c6);
        
        customersSet.add(c1);
        customersSet.add(c2);
        customersSet.add(c3);
        customersSet.add(c4);
        customersSet.add(c5);
        customersSet.add(c6);
        
        System.out.print("Keys: ");
        for (String string : customers.keySet()) {
            System.out.print(string + " ");
                    
        }
        
        System.out.println();
        
        System.out.println("Values: ");
        
        for (Customer customer : customers.values()) {
            System.out.println(customer + " ");
        }
        
        Iterator<Customer> it = customersSet.iterator();
        System.out.println("Iterating over HashSet");
        while (it.hasNext()) {
            System.out.println(it.next());
        }*/
        
        WordCounter wordcounter = new WordCounter();
        
        String test = "";
        
        wordcounter.countWordInText(test);
        
        wordcounter.iterateWordCounter();
        
    }
    
}
