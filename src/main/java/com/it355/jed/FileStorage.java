package com.it355.jed;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class FileStorage implements Serializable{
    //Objects for making timestamps
    SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd_HHmmss");
    String timestamp = format.format(new Date());
    
    //StoreFile method serializes objects in .dat file. Creates a new file every time it's called by using timestamps. 
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