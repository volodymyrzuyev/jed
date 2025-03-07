package com.it355.jed.rules;

/**
 * Program to showcase Rule MET00-J
 * @author Josh Ripoli
 */

public class MET00J_Main {
    
    public static void main(String[] args) {
        TestClass test1 = new TestClass(true, 10);
        System.out.println("Working object: ");

        System.out.println("Object ID: " + test1.getObjectID());
        test1.updateObject(20);
        System.out.println("Object ID after update: " + test1.getObjectID());

        TestClass test2 = new TestClass(false, 5);
        System.out.println("\nUninitialized object: ");
        test2.updateObject(7);
    }

    public static class TestClass{
        private Object object;

        public TestClass(Boolean setObject, int id) {
            if(setObject){
                object = new Object(id);
            }
            else{
                object = null;
            }
        }

        /**
         * 
         * @param object takes an object and attempt to update it
         */
        public void updateObject(int id) {
            if(object == null){
                throw new IllegalArgumentException("Object cannot be null.");
            }
            object.setId(id);
        }

        /**
         * 
         * @return id of the object
         */
        public int getObjectID() {
            return object.getId();
        }

        private static class Object{
            private int id;

            public Object(int newId){
                id = newId;
            }

            public void setId(int newId) {
                id = newId;
            }

            public int getId() {
                return id;
            }
        }
    }
}
