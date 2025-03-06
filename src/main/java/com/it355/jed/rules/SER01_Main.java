package com.it355.jed.rules;
//Rule: SER01-J – Do not deviate from the proper signatures of serialization methods 

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileInputStream;

final class SER01_Main implements Serializable{

    //writeObject and readObject must be declared private nonstatic
    private void writeObject(final ObjectOutputStream oos)
        throws IOException{
            oos.defaultWriteObject();
        }
    //readResolve and writeReplace must be declared protected and nonstatic
    protected Object readResolve()
    {
       return new SER01_Main();
    }

    public static void main(String[] args) 
    {
        SER01_Main obj = new SER01_Main();
        //serialization
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("SER01.dat")))
        {
            oos.writeObject(obj);

        }catch(IOException e)
        {
            e.printStackTrace();
        }

        //deserialization
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SER01.dat")))
        {
            SER01_Main deserializedObj = (SER01_Main) ois.readObject();
        }catch(IOException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}

