package com.bankManagement;

public class BankManager {
    public static void main(String[] args) {
        SavingsAccount sa=new SavingsAccount(01,50000);
        SavingsAccount sa1=new SavingsAccount(02,40000);
        SavingsAccount sa2=new SavingsAccount(03,30000);

        sa.deposit(12000);
        sa1.deposit(6000);
        sa2.deposit(8000);

    //    sa.deposit(8000);
        double tax=sa.tax(01);
        System.out.println("tax in Savings acc of accId : "+sa.getAccId()+" is " +tax);
        double tax1=sa1.tax(02);
        System.out.println("tax in Savings acc of accId : "+sa1.getAccId()+" is " +tax1);


        int balanceforSavingsAcc=sa.display(sa.getAccId());
        int ba1=sa1.display(sa1.getAccId());
        int ba2=sa2.display(sa2.getAccId());
        System.out.println("Balance in Savings acc before withdrawal of accId : "+sa.getAccId()+" is " +balanceforSavingsAcc);

        System.out.println("Balance in Savings acc before withdrawal of accId : "+sa1.getAccId()+" is " +ba1);
        System.out.println("Balance in Savings acc before withdrawal of accId : "+sa2.getAccId()+" is " +ba2);
        sa.withdraw(500000);//INSUFFIENT BALANCE.

         balanceforSavingsAcc=sa.display(sa.getAccId());



        System.out.println("Balance in Savings acc after withdrawal is of accId : "+sa.getAccId()+" is " +balanceforSavingsAcc);

       //   int salaryForSalaried=se.calculateSalary(se.getDaysPresent(),se.getBasicSalary());
       // System.out.println("Salary of Salaried Emp :: "+salaryForSalaried);

        CurrentAccount ca=new CurrentAccount(02,50000);
        int balanceforCurrentAcc=ca.currentBalance(ca.getAccId());
        System.out.println("Balance in Current acc of accId : "+ca.getAccId()+" is " +balanceforCurrentAcc);

        DematAccount da=new DematAccount(03,50000);



        System.out.println("Balance in Savings acc of accId : "+ca.getAccId()+" is " +balanceforSavingsAcc);
        ca.deposit(4000);
       //sa.currentBalance(01);
        ca.withdraw(6000);
        balanceforCurrentAcc=ca.currentBalance(ca.getAccId());

        System.out.println("Balance in Current acc of accId : "+ca.getAccId()+" is " +balanceforCurrentAcc);



    }
}
