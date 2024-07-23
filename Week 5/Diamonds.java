/**
 * Diamonds.java
 * This program uses nested loops to print two diamond shapes side by side,
 * exactly matching the pattern shown in the provided image.
 */
public class Diamonds {
    public static void main(String[] args) {
        printDiamondsSideBySide();
    }
    
    /**
     * Prints both diamond shapes side by side.
     */
    private static void printDiamondsSideBySide() {
        int n1 = 5; // Number of rows for half of the first diamond
        int n2 = 5; // Number of rows for half of the second diamond
        int spacing = 5; // Number of spaces between the diamonds
        
        // Upper half of the diamonds
        for (int i = 1; i <= n1; i++) {
            // First diamond
            printSpaces(n1 - i);
            printStars(2 * i - 1);
            
            // Spacing between diamonds
            printSpaces(spacing);
            
            // Second diamond
            if (i <= n2) {
                printStars(2 * (n2 - i + 1) - 1);
            } 
            
            System.out.println();
        }
        
        // Lower half of the diamonds
        for (int i = n1 - 1; i >= 1; i--) {
            // First diamond
            printSpaces(n1 - i);
            printStars(2 * i - 1);
            
            // Spacing between diamonds
            printSpaces(spacing);
            
            // Second diamond
            if (i <= n2) {
                printStars(2 * (n2 - i + 1) - 1);
            }
            
            System.out.println();
        }
    }
    
    /**
     * Utility method to print a given number of spaces.
     */
    private static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }
    
    /**
     * Utility method to print a given number of stars.
     */
    private static void printStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
    }
    
    /**
     * Utility method to print a single star.
     */
    private static void printStar() {
        System.out.print("*");
    }
}
