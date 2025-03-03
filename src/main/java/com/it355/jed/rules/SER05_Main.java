package com.it355.jed.rules;
//Rule: SER05-J – Do not serialize instances of inner classes
//Matt Holliday
import java.io.Serializable;

//Outer class
final class SER05_Main implements Serializable {
    //inner class
    //if inner class must implement serializable, make class static
    static class InnerSER05_Main implements Serializable {

        public static void main(String[] args) {
            
        }
    
    }
}
