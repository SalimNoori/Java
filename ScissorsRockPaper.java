/*
 * This program plays the popular scissors-rock-paper game.
 * A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.
 * The program randomly generates a number 0, 1, or 2 representing scissors, rocks, and paper.
 * The program prompts the user to enter a number 0, 1, or 2 and displays a message indicating 
 * whether the user or the computer wins, loses, or draws.
 */

 import java.util.Scanner;

 public class ScissorsRockPaper {
     public static void main(String[] args) {
         // Create a Scanner object for user input
         Scanner input = new Scanner(System.in);
         
         // Generate a random number between 0 and 2
         int computerChoice = (int)(Math.random() * 3);
         
         // Prompt the user to enter a number 0, 1, or 2
         System.out.print("Enter 0 for scissors, 1 for rock, or 2 for paper: ");
         int userChoice = input.nextInt();
         
         // Display the computer's choice
         switch (computerChoice) {
             case 0:
                 System.out.println("The computer is scissors.");
                 break;
             case 1:
                 System.out.println("The computer is rock.");
                 break;
             case 2:
                 System.out.println("The computer is paper.");
                 break;
         }
         
         // Display the user's choice
         switch (userChoice) {
             case 0:
                 System.out.println("You are scissors.");
                 break;
             case 1:
                 System.out.println("You are rock.");
                 break;
             case 2:
                 System.out.println("You are paper.");
                 break;
             default:
                 System.out.println("Invalid input.");
                 System.exit(1);
         }
         
         // Determine the result of the game
         if (userChoice == computerChoice) {
             System.out.println("It's a draw.");
         } else if ((userChoice == 0 && computerChoice == 2) ||
                    (userChoice == 1 && computerChoice == 0) ||
                    (userChoice == 2 && computerChoice == 1)) {
             System.out.println("You win!");
         } else {
             System.out.println("You lose.");
         }
         
         // Close the scanner
         input.close();
     }
 }
 