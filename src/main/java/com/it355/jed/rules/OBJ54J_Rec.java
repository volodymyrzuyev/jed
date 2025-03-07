package com.it355.jed.rules;

/**
 * Program to showcase Recommendation OBJ54-J
 * @author Josh Ripoli
 */

public class OBJ54J_Rec {
    public static void main(String[] args) {
        int [] list = new int[100];
        createList(list);
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
    }
        /**
         * creates a list of numbers 0-99
         * @param list 
         */
        public static void createList(int [] list){
        for (int i = 0; i < list.length; i++) {
            list[i]+= i;
        }
    }
}
