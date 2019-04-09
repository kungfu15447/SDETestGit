/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweightproject;

import java.util.HashMap;
import javafx.scene.image.Image;

/**
 *
 * @author Frederik Jensen
 */
public class MonsterFactory
{
    private final HashMap<String, Monster> monsterCache;
    
    public MonsterFactory() {
        monsterCache = new HashMap<>();
    }
    
    public Monster getMonster(String specie) {
        Monster monster = monsterCache.get(specie);
        
        if (monster == null) {
            Image look = new Image(specie + ".png", 100, 100, true, true);
            monster = new Monster(look, specie);
            monsterCache.put(specie, monster);
        }
        return monster;
    }
}
