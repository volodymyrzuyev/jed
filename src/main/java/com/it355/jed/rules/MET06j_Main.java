package com.it355.jed.rules;

/**
 * Program to showcase Rule ERR08-J
 * @author Josh Ripoli
 */

public class MET06j_Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Parent p = new Parent(10, 2);
        Sub s = new Sub(5, 6);

        Sub newSub = (Sub)s.copy();
        Parent newParent = (Parent)p.copy();
        System.out.println("Parent updated values: " + newParent.getValue1() + ", " + newParent.getValue2());
        System.out.println("Sub updated values: " + newSub.getValue1() + ", " + newSub.getValue2());
    }


    public static class Parent implements Cloneable{
        private int num1,num2;
    
        public Parent(int num1, int num2) {
            this.num1 = num1;
            this.num2 = num2;
        }
        
        /**
         * 
         * @return a copy of the parent class object with an updated value for num1
         * @throws CloneNotSupportedException
         */
        public Parent copy() throws CloneNotSupportedException{
            final Parent parentCopy = (Parent) super.clone();
            parentCopy.num1 = parentCopy.multiply();
            parentCopy.num2 = parentCopy.num2 + 10;
    
            return parentCopy;
        }
        
        /**
         * 
         * @return multiplies num1 and num2 together
         */
        public final int multiply(){
            return num1 * num2;
        }

        /**
         * 
         * @return value of num1
         */
        public int getValue1() {
            return num1;
        }

        /**
         * 
         * @return value of num2
         */
        public int getValue2() {
            return num2;
        }
    
    }
    
    public static class Sub extends Parent{
        private int num1,num2;

        public Sub(int num1, int num2) {
            super(num1, num2);
            this.num1 = num1;
            this.num2 = num2;
        }

        /**
         * 
         * @return a copy of the sub class object with an updated value for num2
         * @throws CloneNotSupportedException
         */
        public Parent clone() throws CloneNotSupportedException{
            final Sub subCopy = (Sub) super.clone();
            subCopy.num2 = super.multiply();
            return subCopy;
        }

        /**
         * 
         * @return value of num1
         */
        public int getValue1() {
            return num1;
        }

        /**
         * 
         * @return value of num2
         */
        public int getValue2() {
            return num2;
        }
        

    }
}


