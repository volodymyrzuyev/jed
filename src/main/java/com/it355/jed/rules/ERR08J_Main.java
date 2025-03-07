package com.it355.jed.rules;

/**
 * Program to showcase Rule ERR08-J
 * @author Josh Ripoli
 */

public class ERR08J_Main {
    public static void main(String[] args) {
        // Null pointer exception example
        TestClass object = null;
        System.out.println("Testing uninitialized object");
        if(object == null){
            System.out.println("Object is null and cannot perform arguments");
        }
        System.out.println("Object has now been initialized");
        object = new TestClass(10);
        System.out.println("Objects ID: " + object.getID());
            
        
    }

    public static class TestClass implements Cloneable{
        private int id; 

        public TestClass(int newID){
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
