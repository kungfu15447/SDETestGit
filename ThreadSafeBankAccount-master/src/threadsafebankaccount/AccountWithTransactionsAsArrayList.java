package threadsafebankaccount;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hk
 */
public class AccountWithTransactionsAsArrayList implements IAccount {
    // Multithreaded access to regular collections is not safe. It can result
    // in a java.util.ConcurrentModificationException.
    //private final List<Double> transactionsArray = new ArrayList<>();
    
    private final List<Double> transactionsArray = new CopyOnWriteArrayList<>();

    @Override
    public double getBalance() {
        Double balance = 0.0;
        for (Double amount : transactionsArray) {
            balance += amount;
            try {
                Thread.sleep(2);
            } catch (InterruptedException ex) {
                Logger.getLogger(IAccount.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return balance;
    }

    @Override
    public void changeBalance(double amount) {
        transactionsArray.add(amount);
    }
    
}
