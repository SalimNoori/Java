/**
 * MathMethods.java
 * This program demonstrates various Math class methods in Java.
 * It prompts the user for input and performs mathematical operations using Math class methods.
 */

 import java.util.Scanner;

 public class MathMethods {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         // Part A: Calculate absolute value of a negative integer
         System.out.print("Enter a negative integer: ");
         int negativeInt = scanner.nextInt();
         int absValue = Math.abs(negativeInt);
         System.out.println("a) Absolute value\t: " + absValue);
 
         // Part B: Calculate cosine, sine, and tangent of an angle
         System.out.print("Enter an angle in degrees: ");
         double angle = Math.toRadians(scanner.nextDouble()); // Convert to radians
         System.out.println("b) Cosine\t\t: " + Math.cos(angle));
         System.out.println("   Sine\t\t\t: " + Math.sin(angle));
         System.out.println("   Tangent\t\t: " + Math.tan(angle));
 
         // Part C: Calculate floor and ceiling of a floating-point number
         System.out.print("Enter a floating-point number: ");
         double floatNum = scanner.nextDouble();
         System.out.println("c) Floor value\t\t: " + Math.floor(floatNum));
         System.out.println("   Ceiling value\t: " + Math.ceil(floatNum));
 
         // Part D: Calculate X raised to the power of Y
         System.out.print("Enter X (base): ");
         double x = scanner.nextDouble();
         System.out.print("Enter Y (exponent): ");
         double y = scanner.nextDouble();
         System.out.println("d) X^Y\t\t\t: " + Math.pow(x, y));
 
         // Part E: Calculate square root of positive and negative numbers
         System.out.print("Enter a positive integer: ");
         int positiveInt = scanner.nextInt();
         System.out.println("e) Square root (positive): " + Math.sqrt(positiveInt));
 
         System.out.print("Enter a negative integer: ");
         int negativeInt2 = scanner.nextInt();
         if (negativeInt2 < 0) {
             System.out.println("   Square root (negative): " + Double.NaN + " (Not a Number)");
         } else {
             System.out.println("   Square root (negative): " + Math.sqrt(negativeInt2));
         }
 
         scanner.close();
     }
 }