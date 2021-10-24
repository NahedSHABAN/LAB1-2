/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication60;

/**
 *
 * @author BOODY
 */
public class ACCount {
    private int ID = 0;
    private double Balance = 0.0;
    private static double Annual_Interest_Rate = 0.0;
    private java.util.Date Date_Created;

    public ACCount() 
    {
        Date_Created = new java.util.Date();
    }

    public ACCount(int id, double balace) 
    {
        this();
        this.ID = id;
        this.Balance = Balance;
    }

    public int getId() {
        return this.ID;
    }

    public double getBalance() {
        return this.Balance;
    }

    public double getAnnualInterestRate() {
        return Annual_Interest_Rate;
    }

    public String getDateCreated() {
        return this.Date_Created.toString();
    }

    public void setId(int id) {
        this.ID = id;
    }

    public void setBalance(double balance) {
        this.Balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.Annual_Interest_Rate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return (Annual_Interest_Rate / 100) / 12 ;
    }

    public double getMonthlyInterest() {
        return Balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        this.Balance -= amount;
    }

    public void deposit(double amount) {
        this.Balance += amount;
    }
    
}
