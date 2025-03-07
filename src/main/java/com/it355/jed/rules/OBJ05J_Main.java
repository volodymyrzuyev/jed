package com.it355.jed.rules;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Program to showcase Rule OBJ05-J
 * @author Josh Ripoli
 */


public class OBJ05J_Main implements Cloneable{
    public static void main(String[] args) throws CloneNotSupportedException {
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = null;
        try {
            birthday = date.parse("2003-02-06");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (birthday != null) {
            Birthday myBirthday = new Birthday(birthday);
            System.out.println("My birthday is " + myBirthday.getDate());
        }
        else
            System.out.println("Unable to set birth date");
    }


    public static class Birthday implements Cloneable{
        private Date birthday;

        public Birthday(Date date){
            birthday = date;
        }

        /**
         * Retrieves the date from an object
         * 
         * @return a cloned copy of a date 
         * @throws CloneNotSupportedException
         * 
         */
        public Date getDate() throws CloneNotSupportedException{
            
            return (Date)birthday.clone();
        }
    }
}
