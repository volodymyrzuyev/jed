package com.it355.jed.rules;

/**
 * Program to showcase Rule MSC01-J
 * @author Thanvii Ambala
 */
public class MSC01J_Main {

    public final int DURATION = 10000; 
    
    public void thanvii() throws InterruptedException {
        int num1 = 15;
        int num2 = 5;
        
        while (true) {

            int sum = num1 + num2;
            int difference = num1 - num2;
            int product = num1 * num2;
            double quotient = (num2 != 0) ? (double) num1 / num2 : Double.NaN; 

            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
            System.out.println("Quotient: " + quotient);

            Thread.sleep(DURATION);
        }
    }

    public static void main(String[] args) {
        MSC01J_Main task = new MSC01J_Main();
        
        try {
            task.thanvii();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
