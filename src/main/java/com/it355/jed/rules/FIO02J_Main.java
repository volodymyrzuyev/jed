package com.it355.jed.rules;

/**
 * Program to showcase Rule FIO022-J
 * @author Thanvii Ambala
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FIO02J_Main{
        public static void main(String args[]){
                File file = new File("lines.txt");
                System.out.println(file.exists());
            try {
                Scanner scan = new Scanner(file);
            } catch (FileNotFoundException ex) {
            }
                
        }
}