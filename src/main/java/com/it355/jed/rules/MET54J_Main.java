package com.it355.jed.rules;

/**
 * Program to showcase Rule MET54-J
 * @author Thanvii Ambala
 */
public class MET54J_Main {
    public boolean validateAge(int age) {
        if (age < 0) {
            System.out.println("Invalid age input.");
            return false; 
        }

        if (age >= 18) {
            System.out.println("Age is valid. You are an adult.");
            return true; 
        } else {
            System.out.println("Age is invalid. You are underage.");
            return false; 
        }
    }

    public static void main(String[] args) {
        MET54J_Main validator = new MET54J_Main ();
        
        // Test with valid age
        boolean result = validator.validateAge(20);
        System.out.println("Validation result: " + result);

        // Test with invalid age
        result = validator.validateAge(16);
        System.out.println("Validation result: " + result);
    }
}
