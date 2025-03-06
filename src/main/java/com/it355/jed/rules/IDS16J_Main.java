package com.it355.jed.rules;

public class IDS16J_Main {
    static final String xml = "<interest>14</interest>";

    public static void main(String[] args) {
        String interest = xml.replace("<interest>", "");
        interest = interest.replace("</interest>", "");
        int interetstVal = Integer.parseInt(interest);
        System.out.println(interetstVal);
    }
}
