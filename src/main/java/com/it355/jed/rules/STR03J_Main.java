package com.it355.jed.rules;
 
/**
 * Program to showcase Rule STR03-J
 * @author Thanvii Ambala
 */
class STR03J_Main {
  static void changeString(String str)
  {
    char[] c = str.toCharArray();
    for (int i = 0; i < str.length(); i++) {
      int dist = c[i] - 'a';
 
      if (dist + (c[i] - 'a') >= 26) {
        dist = (dist + (c[i] - 'a')) % 26;
        c[i] = (char)('a' + dist);
      }
 
      else {
        c[i] = (char)(c[i] + dist);
      }
    }
 
    String s = new String(c);
    System.out.println(s);
  }
 
  public static void main(String[] args)
  {
    String str = "cycleofalphabet";
    changeString(str);
  }
}
