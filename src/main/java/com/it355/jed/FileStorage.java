package com.it355.jed;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class FileStorage implements Serializable {
    // serializationUID
    private static final long serialVersionUID = 1L;

    /**
     * Stores serialized objects from employee list and deparment list in a unique
     * file. This method will never overwrite any previously
     * stored file.
     * 
     * @param employees
     */
    public String storeFile(ArrayList<Employee> employees, HashMap<String, EmployeeList> dptList) {
        // Check to see if lists are empty
        if (employees.isEmpty() && dptList.isEmpty()) {
            System.out.println("Employee list and Department List is empty");
            return "";
        }

        // Objects for making timestamps
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd_HHmmss");
        String timestamp = format.format(new Date());

        File filename = new File("employees_" + timestamp + ".dat");
        // Serialize objects
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(employees);
            oos.writeObject(dptList);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return filename.toString();
    }

}
