package com.company;

public class SpecialCheckingAccount extends CheckingAccount{

    private double minimumBalance;
    private double annualInterestRate;

    public SpecialCheckingAccount(int idNumber, double startBal, double cc, double aIR, double minBal){
        super(idNumber, startBal, cc);
        annualInterestRate = aIR;
        minimumBalance = minBal;
    }

    public void clearCheck(double amount){
        if(currentBalance() > minimumBalance){
            decreaseBalance(amount);
        }
        else{
            super.clearCheck(amount);
        }
    }

    public double monthlyInterest() {
        if(currentBalance() > minimumBalance){
            return currentBalance()*annualInterestRate/12;
        }
        else{
            return super.monthlyInterest();
        }
    }
}
