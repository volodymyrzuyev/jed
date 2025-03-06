package com.it355.jed.rules;

import java.io.Externalizable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

public class SER11J_Main extends FIO14J_Main implements Externalizable, Cloneable {
    Boolean isInitialized = false;

    public String UUID;

    public void writeExternal(ObjectOutput out) throws IllegalStateException, IOException {
        if (!isInitialized) {
            throw new IllegalStateException();
        }
        out.writeChars(UUID);
    }

    public void readExternal(ObjectInput in) throws IllegalStateException, IOException {
        if (isInitialized) {
            throw new IllegalStateException();
        }
        UUID = in.readLine();
        isInitialized = true;
    }

    public SER11J_Main clone() {
        return super.clone();
    }

    public static void main(String[] args) throws Exception {
        File in = new File("test.ser");
        FileInputStream stream = new FileInputStream(in);
        ObjectInputStream scan = new ObjectInputStream(stream);
        SER11J_Main obj = new SER11J_Main();
        obj.readExternal(scan);
        System.out.println("UUID: " + obj.UUID);
    }

}
