/**
 * This program calculates and displays the area and perimeter of a rectangle
 * with predefined dimensions.
 */
public class Practice_1_3 {
    
    public static void main(String[] args) {
        // Constants for the dimensions of the rectangle
        int width = 4;   // Width of the rectangle
        int height = 8;  // Height of the rectangle
        
        // Calculate area and perimeter
        int area = width * height;                         // Calculating area
        int perimeter = 2 * (width + height);              // Calculating perimeter
        
        // Displaying results with appropriate labels
        System.out.println("Rectangle Dimensions:");
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
