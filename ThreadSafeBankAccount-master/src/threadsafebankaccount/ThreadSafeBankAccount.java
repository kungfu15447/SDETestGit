package threadsafebankaccount;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadSafeBankAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        IAccount account = new SimpleAccount();
        //IAccount account = new AccountWithTransactionsAsArrayList();
        //IAccount account = new AccountWithTransactionsAsHashMap();
        
        for (int i = 0; i < 1000; i++) {
            account.changeBalance(1);
        }
        Double balance = account.getBalance();
        
        System.out.println("Balance from Main: " + balance);
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Runnable reader = new Reader(account);
        Runnable writer = new Writer(account);
        executor.submit(writer);
        executor.submit(reader);
        executor.shutdown();
    }

}

class Reader implements Runnable {

    IAccount account;

    public Reader(IAccount a) {
        account = a;
    }

    @Override
    public void run() {
        Double balance = account.getBalance();
        System.out.println("Balance from Reader: " + balance);
    }

}

class Writer implements Runnable {

    IAccount account;

    public Writer(IAccount a) {
        account = a;
    }

    @Override
    public void run() {
        for (int i = 0; i < 2000; i++) {
            account.changeBalance(1);
        }
    }

}
