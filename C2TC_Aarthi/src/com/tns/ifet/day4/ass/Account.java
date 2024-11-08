package com.tns.ifet.day4.ass;

public abstract class Account {
	protected double balance;

    // Constructor
    public Account(double balance) {
        this.balance = balance;
    }

    // Abstract methods
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();

}
