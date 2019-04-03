/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsafebankaccount;

/**
 *
 * @author hk
 */
public interface IAccount {
    double getBalance();
    void changeBalance(double amount);
}
