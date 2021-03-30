package com.company;

public class CheckingAccount extends Account {

    /**
     * @param idNumber
     * @param startBal
     */
    private double checkCharge;


    //good?
    public CheckingAccount(int idNumber, double startBal, double cc) {
        super(idNumber, startBal);
        checkCharge = cc;
    }

    public void clearCheck(double amount)
    {
        decreaseBalance(amount + checkCharge);
    }

    //confused
    /* (non-Javadoc)
     * @see Account#monthlyInterest()
     */
    @Override
    public double monthlyInterest() {
        // TODO Auto-generated method stub
        return 1.0;
    }

}