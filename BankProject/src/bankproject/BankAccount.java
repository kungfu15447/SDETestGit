/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankproject;

/**
 *
 * @author Frederik Jensen
 */
public class BankAccount
{

    //Constants
    public static final double DEFAULT_INTEREST_RATE = 0.01;

    //Instance fields
    private int accNumber;

    private double balance;

    private double interestRate;

    //Constructers
    public BankAccount(int accNumber)
    {
        this.accNumber = accNumber;
        this.balance = 0;
        this.interestRate = DEFAULT_INTEREST_RATE;
    }

    public BankAccount(int accNumber, double initialBalance)
    {
        if (initialBalance < 0)
        {
            throw new IllegalArgumentException("You cant creat an account with a negative balance");
        } else
        {
            this.accNumber = accNumber;
            this.balance = initialBalance;
            this.interestRate = DEFAULT_INTEREST_RATE;
        }
    }

    //Opreations:
    public int getAccountNumber()
    {
        return accNumber;
    }

    public double getBalance()
    {
        return balance;
    }

    public double getInteresteRate()
    {
        return interestRate;
    }

    public void deposit(double amount)
    {
        if (amount < 0)
        {
            throw new IllegalArgumentException("You cant deposit a negative amount to your bank account!");
        } else
        {
            balance = balance + amount;
        }
    }

    public void withdraw(double amount)
    {
        if (amount < 0) {
            throw new IllegalArgumentException("You cant withdraw a negative amount to your bank account!");
        } else {
        balance = balance - amount;
        }
    }

    public void setInterestRate(double interestRate)
    {
        this.interestRate = interestRate;
    }

    public void addInterest()
    {
        balance = balance * (interestRate + 1);
    }
}
