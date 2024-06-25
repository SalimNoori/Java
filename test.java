// Class: HelloWorld
// Name: [Your Name]
// Instructor: [Instructor's Name]
// Assignment: 1

import java.util.Scanner;

public class HelloWorld 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Please enter your name: ");
        String name = s.nextLine(); // corrected variable name and method call
        
        System.out.println("Hello " + name + "!");
        
        // Closing the Scanner object
        s.close();
    }
}
