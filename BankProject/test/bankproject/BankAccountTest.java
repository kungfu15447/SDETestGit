/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankproject;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Frederik Jensen
 */
public class BankAccountTest
{

    public BankAccountTest()
    {
    }

    @BeforeClass
    public static void setUpClass()
    {
    }

    @AfterClass
    public static void tearDownClass()
    {
    }

    /**
     * Test of getAccountNumber method, of class BankAccount.
     */
    @Test
    public void testGetAccountNumber()
    {
        System.out.println("BankAccountTest: testGetAccountNumber");

        int accNumber = 100;

        BankAccount account = new BankAccount(accNumber);

        assertEquals(accNumber, account.getAccountNumber());
    }

    /**
     * Test of getBalance method, of class BankAccount.
     */
    @Test
    public void testGetBalance()
    {
        System.out.println("BankAccountTest: testGetBalance");

        double balance = 5400.00;

        BankAccount account = new BankAccount(20, balance);

        assertEquals(balance, account.getBalance(), 1E-3);
    }

    /**
     * Test of getInteresteRate method, of class BankAccount.
     */
    @Test
    public void testGetInteresteRate()
    {
        System.out.println("BankAccountTest: testGetInteresteRate");

        BankAccount account = new BankAccount(40);

        assertEquals(BankAccount.DEFAULT_INTEREST_RATE, account.getInteresteRate(), 1E-3);
    }

    /**
     * Test of deposit method, of class BankAccount.
     */
    @Test
    public void testDeposit()
    {
        System.out.println("BankAccountTest: testdeposit");

        double initialBalance = 1000.00;
        double amount = 500.50;

        BankAccount account = new BankAccount(1111, initialBalance);

        account.deposit(amount);

        assertEquals(initialBalance + amount, account.getBalance(), 1E-3);

    }

    /**
     * Test of withdraw method, of class BankAccount.
     */
    @Test
    public void testWithdraw()
    {
        System.out.println("BankAccountTest: testwithdraw");

        double initialBalance = 1000.00;
        double amount = 500.50;

        BankAccount account = new BankAccount(112, initialBalance);

        account.withdraw(amount);

        assertEquals(initialBalance - amount, account.getBalance(), 1E-3);
    }

    /**
     * Test of setInterestRate method, of class BankAccount.
     */
    @Test
    public void testSetInterestRate()
    {
        System.out.println("BankAccountTest: testSetInterestRate");

        double interestRate = 0.05;

        BankAccount account = new BankAccount(102);

        account.setInterestRate(interestRate);

        assertEquals(interestRate, account.getInteresteRate(), 1E-3);

    }

    /**
     * Test of addInterest method, of class BankAccount.
     */
    @Test
    public void testAddInterest()
    {
        System.out.println("BankAccountTest: testAddInterest");

        BankAccount account = new BankAccount(150, 2200);

        account.addInterest();

        assertEquals(2200 * (1 + account.getInteresteRate()), account.getBalance(), 1E-3);
    }

    /**
     * Test that an IllegalArgumentException is thrown and the balance remains
     * unchanged, if a negative amount is deposited.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testDepositNegativeAmount()
    {
        System.out.println("BankAccountTest: testDepositNegativeAmount");

        BankAccount account = new BankAccount(22, 1500);

        try
        {
            account.deposit(-1);
        } finally
        {
            assertEquals(1500, account.getBalance(), 1E-3);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBankAccountNegativeBalance()
    {
        System.out.println("BankAccountTest: testBankAccountNegativeBalance");
           
        try {
            BankAccount account = new BankAccount(22, -1000);
        } finally {
            
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithdrawNegativeAmount() {
        System.out.println("BankAccountTest: testWithdrawNegativeAmount");
        
        BankAccount account = new BankAccount(23, 2500);
        
        try {
            account.withdraw(-100);
        } finally {
            assertEquals(2500, account.getBalance(), 1E-3);
        }
    }

}
