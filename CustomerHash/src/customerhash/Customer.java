/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerhash;

import java.util.Objects;

/**
 *
 * @author Frederik Jensen
 */
public class Customer
{
   private String phonenumber;
   private String company_name;
   private String adress;
   private String email;

    public Customer(String phonenumber, String company_name, String adress, String email)
    {
        this.phonenumber = phonenumber;
        this.company_name = company_name;
        this.adress = adress;
        this.email = email;
    }

    public String getPhonenumber()
    {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber)
    {
        this.phonenumber = phonenumber;
    }

    public String getCompany_name()
    {
        return company_name;
    }

    public void setCompany_name(String company_name)
    {
        this.company_name = company_name;
    }

    public String getAdress()
    {
        return adress;
    }

    public void setAdress(String adress)
    {
        this.adress = adress;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.phonenumber);
        return hash;
    }

    @Override
    public boolean equals(Object o)
    {
        return super.equals(o); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString()
    {
        return "Customer{" + "phonenumber=" + phonenumber + ", company_name=" + company_name + ", adress=" + adress + ", email=" + email + '}';
    }
    
   
}
