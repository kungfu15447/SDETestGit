/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategysearch;

import BE.Entity;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Frederik Jensen
 */
public class BinarySearch implements ISearching
{

    @Override
    public Entity searchForEntity(List<Entity> entities, Entity entity)
    {
        Collections.sort(entities);

        int l = 0;
        int lastIndex = entities.size() - 1;

        while (l <= lastIndex)
        {
            int mid = l + (lastIndex - l) / 2;

            if (entities.get(mid).equals(entity))
            {
                return entities.get(mid);
            }
            if (entities.get(mid).compareTo(entity) == 1)
            {
                l = mid + 1;
            } else
            {
                lastIndex = mid - 1;
            }
        }
        return null;
    }

}
