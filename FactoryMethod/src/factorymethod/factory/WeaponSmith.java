/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod.factory;

/**
 *
 * @author Frederik Jensen
 */
public class WeaponSmith
{
    public Weapon create(String weaponType, double magicDmg, double physicalDmg) {
        switch (weaponType)
        {
            case "sword":
                return new Sword(magicDmg, physicalDmg);
            case "mace":
                return new Mace(magicDmg, physicalDmg);
            case "staff":
                return new Staff(magicDmg);
            default:
                throw new AssertionError();
        }
    }
}
