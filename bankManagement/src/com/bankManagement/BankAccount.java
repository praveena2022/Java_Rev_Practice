package com.bankManagement;

public abstract class BankAccount {

    private int accId;
    private int balance;

    public BankAccount() {

    }

    public BankAccount(int accId, int balance) {
        this.accId = accId;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accId=" + accId +
                ", balance=" + balance +
                '}';
    }

    public int getAccId() {
        return accId;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount){


        balance+=amount;

    }

    public void withdraw(int withdrawAmount){
        if(balance>withdrawAmount)
            balance-=withdrawAmount;
        else
            System.out.println("Insuficient balance");
    }

    public int currentBalance(int accId){
        return balance;
    }

    public int display(int accId){
        return balance;
    }





}
