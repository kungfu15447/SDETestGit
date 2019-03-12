/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepattern;

import java.util.ArrayList;

/**
 *
 * @author Frederik Jensen
 */
public class Genre implements IEntity
{
    private String title;
    private ArrayList elements = new ArrayList();
    
    public Genre(String title) {
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
    
    public void add(Object obj) {
        elements.add(obj);
    }
    
    public void remove(Object obj) {
        elements.remove(obj);
    }

    @Override
    public void is()
    {
        System.out.println(getTitle());
        for (Object obj : elements) {
            IEntity ent = (IEntity) obj;
            ent.is();
        }
        
        
    }
    
    
}
