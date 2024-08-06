/**
 * AssigningGrades
 * 
 * This program reads student scores, finds the best score,
 * and assigns grades based on a relative grading scheme.
 * It allows the user to process multiple sets of student data.
 *
 * Grading Scheme:
 * A: score >= best - 10
 * B: score >= best - 20
 * C: score >= best - 30
 * D: score >= best - 40
 * F: score < best - 40
 *
 * @author [Your Name]
 * @version 1.0
 * @since [Current Date]
 */

 import java.util.Scanner;

 public class AssigningGrades {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         boolean continueProgram = true;
 
         while (continueProgram) {
             // Prompt for and read the number of students
             System.out.print("Enter the number of students: ");
             int numberOfStudents = scanner.nextInt();
 
             // Create array to store scores
             int[] scores = new int[numberOfStudents];
 
             // Prompt for and read all scores
             System.out.print("Enter " + numberOfStudents + " scores: ");
             for (int i = 0; i < numberOfStudents; i++) {
                 scores[i] = scanner.nextInt();
             }
 
             // Find the highest score
             int bestScore = findBestScore(scores);
 
             // Display each student's score and assigned grade
             for (int i = 0; i < numberOfStudents; i++) {
                 char grade = assignGrade(scores[i], bestScore);
                 System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
             }
 
             // Ask if the user wants to process another set of scores
             System.out.print("Do you want to run the program again? (yes/no): ");
             String response = scanner.next().toLowerCase();
             continueProgram = response.equals("yes");
         }
 
         // Close the scanner and display exit message
         scanner.close();
         System.out.println("Thank you for using the program. Goodbye!");
     }
 
     /**
      * Finds the highest score in the given array of scores.
      *
      * @param scores An array of integer scores
      * @return The highest score in the array
      */
     private static int findBestScore(int[] scores) {
         int best = scores[0];
         for (int score : scores) {
             if (score > best) {
                 best = score;
             }
         }
         return best;
     }
 
     /**
      * Assigns a grade based on the student's score and the best score.
      *
      * @param score The student's score
      * @param bestScore The highest score in the class
      * @return A character representing the assigned grade (A, B, C, D, or F)
      */
     private static char assignGrade(int score, int bestScore) {
         if (score >= bestScore - 10) return 'A';
         else if (score >= bestScore - 20) return 'B';
         else if (score >= bestScore - 30) return 'C';
         else if (score >= bestScore - 40) return 'D';
         else return 'F';
     }
 }