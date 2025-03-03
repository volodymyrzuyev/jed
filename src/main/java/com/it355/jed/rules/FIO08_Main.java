package com.it355.jed.rules;
//Rule: FIO08-J - Distinguish between characters or bytes read from a stream and –1
//Recommendation: ERR54-J – Use a try-with-resources statement to safely handle closeable resources
//Matt Holliday

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.*;

final class FIO08_Main {

    public static void main(String[] args) {
        File file = new File("test.txt");
        try(FileInputStream in = new FileInputStream(file))
        {
            int input;
            byte data;
            while((input = in.read()) != -1)
            {
                data = (byte) input;
            }
        }catch(FileNotFoundException fnfe)
        {
            System.out.println("File not found");
            System.err.println("File is at " + file.getAbsolutePath());
            fnfe.printStackTrace();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    
}
    
}
