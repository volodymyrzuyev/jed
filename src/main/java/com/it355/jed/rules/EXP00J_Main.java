package com.it355.jed.rules;

/**
 * Program to showcase Rule EXP00-J
 * @author Thanvii Ambala
 */
public class EXP00J_Main {
    
    double avg(double x, double y) {
        double result = (x + y) / 2.0;
        return result;
    }

    public static void main(String[] args){
        EXP00J_Main returnMethods = new EXP00J_Main();
        System.out.println(returnMethods.avg(5.5,6.5));
    }
}
