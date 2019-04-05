/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplesearching;

import BE.Entity;
import Context.Context;
import StopWatch.StopWatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import strategysearch.BinarySearch;
import strategysearch.LinearSearch;

/**
 *
 * @author Frederik Jensen
 */
public class SimpleSearching
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        List<String> things = new ArrayList<>();
        things.add("Apple");
        things.add("Tree");
        things.add("Worm");
        things.add("Star");
        things.add("Number");
        things.add("Noun");
        things.add("Universe");
        things.add("Gas");
        things.add("Human");
        things.add("Dog");
        Random r = new Random();
        
        
        Context linearSearch = new Context(new LinearSearch());
        Context binarySearch = new Context(new BinarySearch());
        
        StopWatch stopwatch = new StopWatch();
        
        List<Entity> entities = new ArrayList<>();
        List<Entity> entities1 = new ArrayList<>();
        List<Entity> entities2 = new ArrayList<>();
        List<Entity> entities3 = new ArrayList<>();
        List<Entity> entities4 = new ArrayList<>();
        
        for (int i = 0; i < 1000; i++) {
            Entity entity = new Entity(r.nextDouble(), true, things.get(r.nextInt(things.size())) + Integer.toString(i));
            entities.add(entity);
        }
        
        for (int i = 0; i < 100000; i++) {
            Entity entity = new Entity(r.nextDouble(), true, things.get(r.nextInt(things.size())) + Integer.toString(i));
            entities1.add(entity);
        }
        
        for (int i = 0; i < 1000000; i++) {
            Entity entity = new Entity(r.nextDouble(), true, things.get(r.nextInt(things.size())) + Integer.toString(i));
            entities2.add(entity);
        }
        
        for (int i = 0; i < 10000000; i++) {
            Entity entity = new Entity(r.nextDouble(), true, things.get(r.nextInt(things.size())) + Integer.toString(i));
            entities3.add(entity);
        }
        
        
        System.out.println("Linear search for 1000 entities:");
        stopwatch.start();
        linearSearch.searchForEntity(entities, entities.get(999));
        stopwatch.stop();
        System.out.println("The time was for finding " + entities.get(999) + " was " + stopwatch.getElapsedTime() + " milliseconds");
        
        stopwatch.reset();
        
        System.out.println("Linear search for 100.000 entities:");
        stopwatch.start();
        linearSearch.searchForEntity(entities1, entities1.get(99999));
        stopwatch.stop();
        System.out.println("The time was for finding " + entities1.get(99999) + " was " + stopwatch.getElapsedTime() + " milliseconds");
        
        stopwatch.reset();
        
        System.out.println("Linear search for 1.000.000 entities:");
        stopwatch.start();
        linearSearch.searchForEntity(entities2, entities2.get(999999));
        stopwatch.stop();
        System.out.println("The time was for finding " + entities2.get(999999) + " was " + stopwatch.getElapsedTime() + " milliseconds");
        
        stopwatch.reset();
        
        System.out.println("Linear search for 10.000.000 entities:");
        stopwatch.start();
        linearSearch.searchForEntity(entities3, entities3.get(9999999));
        stopwatch.stop();
        System.out.println("The time was for finding " + entities3.get(9999999) + " was " + stopwatch.getElapsedTime() + " milliseconds");
        
        stopwatch.reset();
        
        System.out.println("Linear search for 100.000.000 entities:");
        stopwatch.start();
        linearSearch.searchForEntity(entities4, entities4.get(99999999));
        stopwatch.stop();
        System.out.println("The time was for finding " + entities4.get(99999999) + " was " + stopwatch.getElapsedTime() + " milliseconds");
        
    }
    
}
