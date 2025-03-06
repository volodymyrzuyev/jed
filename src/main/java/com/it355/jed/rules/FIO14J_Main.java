package com.it355.jed.rules;

import java.io.File;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class FIO14J_Main {
    public SER11J_Main clone() {
        return new SER11J_Main();
    }

    public static void main(String[] args) throws Exception {
        Path file = Paths.get("test.txt");
        BasicFileAttributes attr1 = Files.readAttributes(file, BasicFileAttributes.class);
        PrintStream out = null;
        try {
            out = new PrintStream(new File("test.txt"));
            out.println("Hello From FIO14J");
            out.close();
        } finally {
            out.close();
        }
        Path fileEdited = Paths.get("test.txt");
        BasicFileAttributes attr2 = Files.readAttributes(fileEdited, BasicFileAttributes.class);

        if (!attr1.creationTime().equals(attr2.creationTime())) {
            System.out.println("It's a different file boys");
        }
        System.out.println("Still the same file");
    }
}
