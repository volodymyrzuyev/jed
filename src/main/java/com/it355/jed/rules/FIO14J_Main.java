package com.it355.jed.rules;

import java.io.File;
import java.io.PrintStream;

public class FIO14J_Main {
    public static void main(String[] args) throws Exception {
        PrintStream out = new PrintStream(new File("test.txt"));
        try {
            out.println("Hello From FIO14J");
            out.close();
        } catch (Exception e) {
            out.close();
        }

    }
}
