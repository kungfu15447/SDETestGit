/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Context;

import BE.Entity;
import java.util.List;
import strategysearch.ISearching;

/**
 *
 * @author Frederik Jensen
 */
public class Context
{
    private ISearching searching;
    
    public Context(ISearching searching) {
        this.searching = searching;
    }
    
    public Entity searchForEntity(List<Entity> entities, Entity entity) {
        return searching.searchForEntity(entities, entity);
    }
}
