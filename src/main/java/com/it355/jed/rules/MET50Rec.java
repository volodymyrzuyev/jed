package com.it355.jed.rules;
//Recommendation MET50-J: Avoid ambigous or confusing uses of overloading
//Matt Holliday

public class MET50Rec {
   
   /**
    * Divides using doubles. Avoids using confusing uses of overloading
    * @param a
    * @param b
    * @return
    */
   public static double divideWithDouble(double a, double b)
   {
      return a/b;
   }  

   /**
    * divides using ints. Avoids using confusing uses of overloading
    * @param a
    * @param b
    * @return
    */
   public static int divideWithInt(int a, int b)
   {
      return a/b;
   }
    


   public static void main(String[] args) {
      System.out.println("Divide by double: " + divideWithDouble(10,3));
      System.out.println("Divide by int: " + divideWithInt(10, 3));
   }


}
