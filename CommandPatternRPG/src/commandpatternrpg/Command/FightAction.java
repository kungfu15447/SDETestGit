/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpatternrpg.Command;

/**
 *
 * @author Frederik Jensen
 */
public interface FightAction
{
    public void execute();
    
    public void undo();
}
