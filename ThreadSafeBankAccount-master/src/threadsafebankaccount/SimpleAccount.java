package threadsafebankaccount;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hk
 */
public class SimpleAccount implements IAccount {

    // Without synchronizing access to the balance we get inconsistent results
    private double balance = 0;

    @Override
    public synchronized double getBalance() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(IAccount.class.getName()).log(Level.SEVERE, null, ex);
        }
        return balance;
    }

    @Override
    public synchronized void changeBalance(double amount) {
        balance += amount;
        try {
            Thread.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(IAccount.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



}
