/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

import factorymethod.factory.Weapon;
import factorymethod.factory.WeaponSmith;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Frederik Jensen
 */
public class Game
{

    public void start()
    {
        List<Weapon> weapons = new ArrayList<>();
        List<Player> players = new ArrayList<>();

        WeaponSmith smith = new WeaponSmith();
        
        Weapon staff = smith.create("staff", 45.3, 0);
        Weapon sword = smith.create("sword", 0, 67.5);
        Weapon mace = smith.create("mace", 24, 67.5);
       
        weapons.add(staff);
        weapons.add(sword);
        weapons.add(mace);

        Player barbarian = new Player("Conan", 4355, sword, 5, 145);
        Player wizard = new Player("Merlin", 535, staff, 45, 25);
        Player assassin = new Player("Leon", 1225, mace, 75, 65);
        
        barbarian.damage(assassin.getWeapon());
        
        assassin.damage(barbarian.getWeapon());
    }
}
