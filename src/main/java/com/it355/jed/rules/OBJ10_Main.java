package com.it355.jed.rules;
//Rule: OBJ10-J - Do not use public static nonfinal fields
//Matt Holliday

final class OBJ10_Account {
    //declared private static final
    private static final long acctID = 123;
    //declared public static FINAL
    public static final long acctID2 = 789;
    /**
     * get acct ID
     * @return
     */
    long getID()
    {
        return acctID;
    }
    
}

//Driver class
final class OBJ10_Main {

    public static void main(String[] args)
    {
    OBJ10_Account a = new OBJ10_Account();
    System.out.println("acct id 1: " + a.getID());
    System.out.println("acct id 2: " + OBJ10_Account.acctID2);
    }
}
