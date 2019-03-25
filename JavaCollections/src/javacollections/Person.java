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
public class Person
{
    private final int id;
    private String name;
    private String birthDate;

    public Person(int id, String name, String birthDate)
    {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getBirthDate()
    {
        return birthDate;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setBirthDate(String birthDate)
    {
        this.birthDate = birthDate;
    }
    
    @Override
    public String toString() {
       return name + " " + birthDate; 
    }
}
