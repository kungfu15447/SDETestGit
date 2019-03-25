/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Frederik Jensen
 */
public class PersonManager
{
    private static PersonManager singleInstance = null;
    private List<Person> personList;
    
    private PersonManager() {
        personList = new ArrayList<>();
    }
    
    public static PersonManager getSingleInstance() {
        if (singleInstance == null) {
            singleInstance = new PersonManager();
        }
        return singleInstance;
    }
    
    public List<Person> getPersons() {
        return personList;
    }
    
    public void setPersons(List<Person> personList) {
        this.personList = personList;
    }
    
    public void addPerson(Person p) {
        personList.add(p);
    }
    
    public void addPersons(Person... p) {
        personList.addAll(Arrays.asList(p));
    }
}
