package com.it355.jed.rules;

import java.util.Locale;
import java.util.Scanner;

public class STR02J_Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Type your message: ");
        String line = in.nextLine();
        in.close();
        if (line.toUpperCase(Locale.ENGLISH).equals("HELLO")) {
            System.out.println("Nice job typing hello");
            return;
        }

        System.out.println("You did not type hello(");
    }
}
