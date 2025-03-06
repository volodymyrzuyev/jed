package com.it355.jed.rules;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
//Rule: SER05-J – Do not serialize instances of inner classes
//Matt Holliday
import java.io.Serializable;

//Outer class
 class SER05 implements Serializable {
    private int value1 = 5;

    //inner class
    //if inner class must implement serializable, make class static
    static class InnerSER05 implements Serializable {

        protected int value2 = 10;
    }
}

public class SER05_Main{

        public static void main(String[] args) {
            //create object of inner class
            SER05.InnerSER05 obj = new SER05.InnerSER05();
            //serialize
            try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("SER05.dat"))){
                oos.writeObject(obj);
            }catch(IOException e)
            {
                e.printStackTrace();
            }
        }
}