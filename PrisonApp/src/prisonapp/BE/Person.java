/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prisonapp.BE;

/**
 *
 * @author Frederik Jensen
 */
public class Person
{
    private String navn;
    private String cpr;

    public Person(String navn, String cpr)
    {
        this.navn = navn;
        this.cpr = cpr;
    }
    
    public void setNavn(String navn)
    {
        this.navn = navn;
    }

    public String getNavn()
    {
        return navn;
    }

    public String getCpr()
    {
        return cpr;
    }
    
}
