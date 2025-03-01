package com.it355.jed;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class FileStorage implements Serializable{
    //serializationUID
    private static final long serializationUID = 1L;

    //Objects for making timestamps
    SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd_HHmmss");
    String timestamp = format.format(new Date());
    
    /**
     * Stores serialized objects in a file in a unique file. This method will never overwrite any previously
     * stored file.
     * @param employees
     */ 
    private void storeFile(ArrayList<Employee> employees){
        File filename = new File("employees_" + timestamp + ".dat");
        //Serialize objects
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(employees);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}