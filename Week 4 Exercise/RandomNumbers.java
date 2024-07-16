/**
 * RandomNumbers.java
 * This program demonstrates the generation of random numbers in Java.
 * It generates random integers and floating-point numbers within specified ranges.
 */

 import java.util.Random;

 public class RandomNumbers {
     public static void main(String[] args) {
         // Initialize Random object
         Random random = new Random();
 
         // Part A: Generate random integer number between 30 and 50 (inclusive)
         int randomA = random.nextInt(21) + 30; // 21 is the range (50-30+1), 30 is the minimum
         System.out.println("a) Random number (30-50)\t: " + randomA);
 
         // Part B: Generate random integer number between 20 and -20 (inclusive)
         int randomB = random.nextInt(41) - 20; // 41 is the range (20-(-20)+1), -20 is the minimum
         System.out.println("b) Random number (20 to -20)\t: " + randomB);
 
         // Part C: Generate random integer number between -20 and -60 (inclusive)
         int randomC = random.nextInt(41) - 60; // 41 is the range (-20-(-60)+1), -60 is the minimum
         System.out.println("c) Random number (-20 to -60): " + randomC);
 
         // Part D: Generate random floating-point number between 0.0 and 15.9999 (inclusive)
         double randomD = random.nextDouble() * 16; // nextDouble() generates between 0.0 and 1.0, multiply by 16 for the range
         System.out.printf("d) Random float (0-15.9999)\t: %.4f%n", randomD);
     }
 }