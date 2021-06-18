package edu.cnm.deepdive;

/*

Given two strings, a and b, create a bigger string made of the first char of a, the first char of b,
the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.

mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
 */

public class CodingBatMixedString {

  public static void main(String[] args) {
    System.out.printf("with the Strings %s and %s, the outcome will be " + mixString("abc", "xyz")
    + ".\n", "abc", "xyz");
    System.out.printf("with the Strings %s and %s, the outcome will be " + mixString("Hi", "There")
        + ".\n", "Hi", "There");
    System.out.printf("with the Strings %s and %s, the outcome will be " + mixString("xxxx", "There")
        + ".\n", "xxxx", "There");


  }

  public static String mixString(String a, String b) {

    StringBuilder result = new StringBuilder();
    int lena = a.length() ;
    int lenb = b.length();
    int max = Math.max(lena, lenb);


    for (int i = 0; i < max; i++) {
      if (i <= lena - 1) {
        result.append(a.charAt(i));
      }
      if (i <= lenb - 1) {
        result.append(b.charAt(i));
      }
    }
    return result.toString();
  }

}
