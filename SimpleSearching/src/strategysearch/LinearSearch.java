/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategysearch;

import BE.Entity;
import java.util.List;

/**
 *
 * @author Frederik Jensen
 */
public class LinearSearch implements ISearching
{

    @Override
    public Entity searchForEntity(List<Entity> entities, Entity entity)
    {
        int counter = 0;
        for (Entity otherEntity : entities) {
            counter++;
            if (otherEntity.equals(entity)) {
                System.out.println(counter);
                return otherEntity;
            }
        }
        return null;
    }
    
}
