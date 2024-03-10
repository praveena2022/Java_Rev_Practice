package com.bankManagement;

public class CurrentAccount extends BankAccount{

    public CurrentAccount() {
    }

    public CurrentAccount(int accId, int balance) {
        super(accId, balance);
    }

    @Override
    public String toString() {
        return "CurrentAccount{} " + super.toString();
    }
}
