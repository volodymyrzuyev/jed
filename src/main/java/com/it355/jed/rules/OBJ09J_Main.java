package com.it355.jed.rules;

/**
 * Program to showcase Rule OBJ09-J
 * @author Thanvii Ambala
 */
public class OBJ09J_Main {

    public static void main(String[] args) {
        Object obj1 = new String("Hey People!");
        Object obj2 = new String("Hey People");

        // Correct: Comparing Class objects directly
        if (obj1.getClass() == obj2.getClass()) {
            System.out.println("Both objects are of the same class based on Class object comparison.");
        } else {
            System.out.println("Objects are of different classes based on Class object comparison.");
        }
    }
}