package com.it355.jed.rules;

/**
 * Program to showcase Rule IDS11-J
 * @author Thanvii Ambala
 */
import java.util.Scanner;

public class IDS11J_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first string:");
        String a1 = scanner.nextLine();  

        System.out.println("Enter second string:");
        String a2 = scanner.nextLine();  
        

        if (validateString(a1) && validateString(a2)) {
            String r = a1 + " " + a2;  
            String r2 = a1.concat(" ").concat(a2);  

           
            System.out.println(r);   
            System.out.println(r2);  
        } else {
            System.out.println("One or both input strings are invalid.");
        }

       
        scanner.close();
    }
    
   
    public static boolean validateString(String str) {
        if (str == null || str.trim().isEmpty()) {
            System.out.println("String is null or empty.");
            return false;
        }
        
        if (str.length() < 3) {
            System.out.println("String is too short.");
            return false;
        }

        return true; 
    }
}
