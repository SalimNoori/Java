// Class:       IT 211
// Term:        Quarter
// Name:        Salim Noori
// Instructor:  Sarah North
// Assignment:  1

import java.util.Scanner;

public class Practice_1_4 
{
    public static void main(String[] args) 
    {
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompting the user to enter their name
        System.out.print("Please enter your name: ");
        
        // Reading the user's input as a string
        String name = scanner.nextLine(); // corrected variable name and method call
        
        // Displaying a personalized greeting message
        System.out.println("Hello " + name + "!");
        
        // Closing the Scanner object to release resources
        scanner.close();
    }
}
