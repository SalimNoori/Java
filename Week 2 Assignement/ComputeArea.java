public class ComputeArea {
    public static void main(String[] args) {
        double radius; // Declare radius
        double area; // Declare area
        final double PI = 3.14159; // Declare constant for π

        // Assign a radius
        radius = 20; // New value is radius

        // Compute area
        // Statement assigned to area and line end with ;
        area = radius * radius * PI;

        // Display results using print statement
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
