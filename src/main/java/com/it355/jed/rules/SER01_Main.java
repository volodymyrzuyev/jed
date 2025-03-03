package com.it355.jed.rules;
//Rule: SER01-J – Do not deviate from the proper signatures of serialization methods 

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

final class SER01_Main implements Serializable{

    //writeObject and readObject must be declared private nonstatic
    private void writeObject(final ObjectOutputStream oos)
        throws IOException{
            oos.defaultWriteObject();
        }
    //readResolve and writeReplace must be declared protected and nonstatic
    protected Object readResolve()
    {
        Object obj= new Object();
        return obj;
    }

    public static void main(String[] args) 
    {

    }
}

