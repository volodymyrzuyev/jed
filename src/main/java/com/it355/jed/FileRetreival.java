package com.it355.jed;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class FileRetreival implements Serializable{

    /**
     * Takes a file name of type string and deserializes it to an EmployeeList object
     * @param fileName the name of a serialized file to be read
     * @return an EmployeeList object
     */
    public EmployeeList RetreiveEmployees(String fileName){
        File file = new File(fileName);
        EmployeeList employeeList = new EmployeeList();
        try(ObjectInputStream inFile = new ObjectInputStream(new FileInputStream(file))){
            employeeList = (EmployeeList) inFile.readObject();
        }
        catch(IOException | ClassNotFoundException e){
            System.out.println("Could not open or read the file into an EmployeeList object");
        }
        return employeeList;
    }

}
