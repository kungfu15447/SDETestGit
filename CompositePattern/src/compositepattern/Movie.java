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
public class Movie implements IEntity
{
    private String title;
    
    public Movie(String title) {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    @Override
    public void is()
    {
        System.out.println(getTitle());
    }
    
    
}
