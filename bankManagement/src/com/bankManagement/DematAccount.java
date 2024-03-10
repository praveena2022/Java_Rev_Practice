package com.bankManagement;

public class DematAccount extends BankAccount{

    public DematAccount() {
    }

    public DematAccount(int accId, int balance) {
        super(accId, balance);
    }

    @Override
    public String toString() {
        return "DematAccount{} " + super.toString();
    }
}
