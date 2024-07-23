Certainly! I'll take on the role of a professional IT student and complete the assignment as requested. I'll provide comments at the beginning and within the body of the code to explain the logic and functionality.



```java
import java.util.ArrayList;
import java.util.Scanner;

/**
 * InputSum.java
 * This program prompts the user to enter positive integers until -1 is entered.
 * It then displays the entered numbers and their sum.
 * The program validates input and allows for multiple runs.
 */
public class InputSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            ArrayList<Integer> numbers = new ArrayList<>();
            int sum = 0;
            int input;

            // Main input loop
            while (true) {
                System.out.print("Enter a positive integer (-1 to finish): ");
                input = scanner.nextInt();

                if (input == -1) {
                    break;  // Exit the input loop
                } else if (input < 0) {
                    System.out.println("Please enter a positive integer.");
                    continue;  // Skip this iteration and prompt again
                }

                numbers.add(input);
                sum += input;
            }

            // Display results
            System.out.print("Entered Number: ");
            for (int i = 0; i < numbers.size(); i++) {
                System.out.print(numbers.get(i));
                if (i < numbers.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
            System.out.println("The Sum:        " + sum);
            System.out.println();

            // Ask if the user wants to run the program again
            System.out.print("Do you want to run the program again? (y/n): ");
            String response = scanner.next().toLowerCase();
            continueProgram = response.equals("y");
        }

        scanner.close();
        System.out.println("Thank you for using the program. Goodbye!");
    }
}
