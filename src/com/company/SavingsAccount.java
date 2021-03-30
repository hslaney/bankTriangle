package com.company;

public class SavingsAccount extends Account{
    private double interestRate;
    //private double interestDue;

    public SavingsAccount(int id, double b, double ir){
        super(id,b);
        interestRate = ir;
    }

    public void withdraw(double money){
        if(super.currentBalance()>=money)
        super.decreaseBalance(money);
    }
    public double monthlyInterest() {
        return super.currentBalance() * interestRate/12;
    }

}
