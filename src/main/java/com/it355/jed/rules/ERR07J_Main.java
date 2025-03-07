package com.it355.jed.rules;

import java.util.Scanner;

/**
 * Program to showcase Rule ERR08-J
 * @author Josh Ripoli
 */
 public class ERR07J_Main {
    public static void main(String[] args) {
        TestClass object;

        // Null pointer exception example
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number for an ID or -1 for a null object test: ");
        int id = input.nextInt();
        if (id < 0){
            object = null;
        }
        else{
            object = new TestClass(id);
        }
        
        if(object == null){
            input.close();
            System.out.println("Testing uninitialized object");
            throw new NullPointerException("object is null");
            
        }
        System.out.println("Object has been initialized");
        System.out.println("Objects ID: " + object.getID());
            
        input.close();
    }

    public static class TestClass implements Cloneable{
        Boolean isValid;
        int id; 

        public TestClass(int newID){
            isValid = true;
            id = newID;
        }

        /**
         * 
         * @return id number of the object
         */
        public int getID(){
            return id;
        }

    }
}