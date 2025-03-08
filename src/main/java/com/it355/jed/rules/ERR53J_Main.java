package com.it355.jed.rules;

/**
 * Program to showcase the recomendation ERR53-J
 * @author Thanvii Ambala
 */
import java.io.FileReader;
import java.io.IOException;

public class ERR53J_Main {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("non_existent_file.txt"); 
        } catch (IOException e) {
            System.out.println("Error: File not found. Please check the file path and try again.");
        }
    }
}