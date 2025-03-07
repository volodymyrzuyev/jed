package com.it355.jed.rules;
//Rule: OBJ01-J - Limit accessibility of fields
//Recommendation: OBJ51-J - Minimize the accessibility of classes and their members
//Matt Holliday

//package private class
final class OBJ01_LimitedBank {
    //declare variable private
    private double balance;

    /**
     * get balance
     * @return
     */
     double getBalance()
    {
        return balance;
    }
    /**
     * set balance
     * @param balance
     */
     void setBalance(double balance)
    {
        this.balance = balance;
    }
}

//Driver class
final class OBJ01_Main
{
    //main method
    public static void main(String args [])
    {
        OBJ01_LimitedBank b = new OBJ01_LimitedBank();
        b.setBalance(100);
        System.out.println("Balance" + b.getBalance());
        
    }
}
