package com.bankManagement;

public class SavingsAccount extends BankAccount implements CalculateTax{

    public SavingsAccount() {
    }

    public SavingsAccount(int accId, int balance) {
        super(accId, balance);
    }

    @Override
    public String toString() {
        return "SavingsAccount{} " + super.toString();
    }

    public double tax(int accId){
        return 0.1*currentBalance(accId);

    }


}
