/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Frederik Jensen
 */
public class PersonManagerQueue
{
    private static PersonManagerQueue singleInstance = null;
    private Queue<Person> personList;
    
    private PersonManagerQueue() {
        personList = new LinkedList<>();
    }
    
    public static PersonManagerQueue getSingleInstance() {
        if (singleInstance == null) {
            singleInstance = new PersonManagerQueue();
        }
        return singleInstance;
    }
    
    public Queue<Person> getPersons() {
        return personList;
    }
    
    public void setPersons(Queue<Person> personList) {
        this.personList = personList;
    }
    
    public void addPerson(Person p) {
        personList.add(p);
    }
    
    public void addPersons(Person... p) {
        personList.addAll(Arrays.asList(p));
    }
    
    public Person getNextPerson() {
        return personList.poll();
    }
    
    public Person whoIsNext() {
        return personList.peek();
    }
}
