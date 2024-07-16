/**
 * StringMethods.java
 * This program demonstrates various String manipulation methods in Java.
 * It reads two strings from the user and performs multiple operations on them.
 */

 import java.util.Scanner;

 public class StringMethods {
     public static void main(String[] args) {
         // Initialize Scanner for user input
         Scanner scanner = new Scanner(System.in);
 
         // Read two strings from the user
         System.out.print("Enter the first string (string_1): ");
         String string_1 = scanner.nextLine();
         System.out.print("Enter the second string (string_2): ");
         String string_2 = scanner.nextLine();
 
         // Part A: Determine the length of string_1
         System.out.println("a) Length of string_1\t: " + string_1.length());
 
         // Part B: Determine the length of string_2
         System.out.println("b) Length of string_2\t: " + string_2.length());
 
         // Part C: Concatenate both strings
         String concatenated = string_1 + string_2;
         System.out.println("c) Concatenated strings\t: " + concatenated);
 
         // Part D: Check if the two strings are equal
         boolean areEqual = string_1.equals(string_2);
         System.out.println("d) Strings are equal\t: " + areEqual);
 
         // Part E: Convert string_1 to upper case
         String upperCase = string_1.toUpperCase();
         System.out.println("e) string_1 in upper case\t: " + upperCase);
 
         // Part F: Convert string_2 to lower case
         String lowerCase = string_2.toLowerCase();
         System.out.println("f) string_2 in lower case\t: " + lowerCase);
 
         // Part G: Extract a valid sub-string from string_1
         String subString = "";
         if (string_1.length() >= 3) {
             subString = string_1.substring(0, 3);
         } else {
             subString = string_1;
         }
         System.out.println("g) Substring of string_1\t: " + subString);
 
         // Close the scanner
         scanner.close();
     }
 }