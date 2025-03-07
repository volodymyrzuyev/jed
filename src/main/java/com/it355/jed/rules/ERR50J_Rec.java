package com.it355.jed.rules;

/**
 * Program to showcase Recommendation ERR50-J
 * @author Josh Ripoli
 */

public class ERR50J_Rec {
    public static void main(String[] args) {
        int [] numList = new int[10];
        for (int i = 0; i < numList.length; i++) {
            numList[i] = i;
        }
        for (int i = 0; i < numList.length; i++) {
            System.out.print(numList[i] + " ");
        }
    }
}
