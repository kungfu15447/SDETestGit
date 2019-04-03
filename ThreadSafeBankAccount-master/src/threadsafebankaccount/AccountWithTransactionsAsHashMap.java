package threadsafebankaccount;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hk
 */
public class AccountWithTransactionsAsHashMap implements IAccount {
    // Multithreaded access to regular collections is not safe. It can result
    // in a java.util.ConcurrentModificationException.
    //private final AbstractMap<UUID, Double> transactionsHashMap = new HashMap<>();

    // The ConcurrentHashMap will not work well for this problem because iterators 
    // are "weakly consistent". Even though individual retrieval and update
    // operations are tread-safe, update operations may change the ConcurrentHashMap
    // while you iterate over it. Retrievals will then reflect the results of 
    // the most recently completed update operations.
    // private final AbstractMap<UUID, Double> transactionsHashMap = new ConcurrentHashMap<>();

    private final Map<UUID, Double> transactionsHashMap = Collections.synchronizedMap(new HashMap<>());

    @Override
    public double getBalance() {
        Double balance = 0.0;

        synchronized (transactionsHashMap) {
            for (Double amount : transactionsHashMap.values()) {
                balance += amount;
                try {
                    Thread.sleep(2);
                } catch (InterruptedException ex) {
                    Logger.getLogger(SimpleAccount.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return balance;
    }

    @Override
    public void changeBalance(double amount) {
        transactionsHashMap.put(UUID.randomUUID(), amount);
        try {
            Thread.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(IAccount.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
