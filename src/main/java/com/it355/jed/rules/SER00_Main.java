package com.it355.jed.rules;
//Rule SER00-J: Enable serialization compatibility during class evolution
//Matt Holliday

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SER00_Main implements Serializable {
    //serialVersionUID unique number
    private static final long serialVersionUID = 24L;

    public static void main(String[] args){
        SER00_Main obj = new SER00_Main();
        //serialization
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("SER00.dat")))
        {
            oos.writeObject(obj);

        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
}
