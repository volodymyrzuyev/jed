package com.it355.jed.rules;

import java.util.Scanner;
import java.text.Normalizer.Form;

public final class IDS01J_Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Type your message: ");
        String line = in.nextLine();
        in.close();
        if (java.text.Normalizer.normalize(line, Form.NFKC).equals("HELLO")) {
            System.out.println("Nice job typing hello");
            return;
        }

        System.out.println("You did not type hello(");
    }

}
