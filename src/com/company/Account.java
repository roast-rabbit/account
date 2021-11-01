package com.company;

public class Account {
    private AccountHolder holder;
    private double balance;

    public AccountHolder getHolder() {
        return holder;
    }

    public void deposit(double amt) {
        this.balance = this.balance + amt;
    }

    public void withdraw(double amt) {
        this.balance = this.balance - amt;
    }

    public void setHolder(AccountHolder holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(AccountHolder holder, double amt) {
        this.holder = holder;
        this.balance = amt;
    }
}
