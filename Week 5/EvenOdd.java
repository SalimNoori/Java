/**
 * EvenOdd.java
 * This program determines and prints all even and odd numbers between 50 and 100.
 * It uses a single while loop to iterate through the numbers and
 * prints even numbers on one line and odd numbers on another, separated by commas.
 */
public class EvenOdd {
    public static void main(String[] args) {
        // Initialize variables
        int number = 50;
        StringBuilder evenNumbers = new StringBuilder();
        StringBuilder oddNumbers = new StringBuilder();

        // Single while loop to determine even and odd numbers
        while (number <= 100) {
            if (number % 2 == 0) {
                // Even number
                evenNumbers.append(number).append(", ");
            } else {
                // Odd number
                oddNumbers.append(number).append(", ");
            }
            number++;
        }

        // Remove the trailing comma and space from both StringBuilder objects
        if (evenNumbers.length() > 0) {
            evenNumbers.setLength(evenNumbers.length() - 2);
        }
        if (oddNumbers.length() > 0) {
            oddNumbers.setLength(oddNumbers.length() - 2);
        }

        // Print results with proper labels and formatting
        System.out.println("Even numbers between 50 and 100:\t" + evenNumbers);
        System.out.println("Odd numbers between 50 and 100:\t" + oddNumbers);
    }
}