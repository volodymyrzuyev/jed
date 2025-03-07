package com.it355.jed.rules;

import java.util.Arrays;

/**
 * Program to showcase Rule ERR08-J
 * @author Josh Ripoli
 */

public class EXP02J_Main {
    public static void main(String[] args) {
        int[] arr1 = new int[20];
        int[] arr2 = new int[20]; 
        System.out.println("Compliant solution: " + Arrays.equals(arr1, arr2));

        System.out.println("Non-compliant solution: " + arr1.equals(arr2));
    }
}
