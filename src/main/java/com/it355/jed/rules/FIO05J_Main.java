package com.it355.jed.rules;

import java.nio.CharBuffer;

public class FIO05J_Main {
    private char[] backingArr;

    FIO05J_Main(String text) {
        backingArr = text.toCharArray();
    }

    public CharBuffer getSafeBuffer() {
        char[] newArr = this.backingArr.clone();
        return CharBuffer.wrap(newArr);
    }

    public static void main(String[] args) {
        FIO05J_Main working = new FIO05J_Main("Hello World");
        CharBuffer toEdit = working.getSafeBuffer();
        System.out.println("Original buffer: " + toEdit);
        System.out.println("Trying to edit original buffer by appending Extra");
        toEdit.append("Extra");
        CharBuffer original = working.getSafeBuffer();
        System.out.println("Original: " + toEdit);
        System.out.println("Copy: " + original);        
    }
}