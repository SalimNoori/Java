// Practice_1_5.java
// Calculates the average speed of a car in kilometers per hour
public class Practice_1_5 {
    public static void main(String[] args) {
        // Given data
        double miles = 75.0; // Distance traveled in miles
        double minutes = 50.0; // Time taken in minutes

        // Conversion factor from miles to kilometers
        double milesToKilometers = 1.6;

        // Convert minutes to hours (since 1 hour = 60 minutes)
        double hours = minutes / 60.0;

        // Calculate distance in kilometers
        double kilometers = miles * milesToKilometers;

        // Calculate speed in kilometers per hour
        double speedKmph = kilometers / hours;

        // Display the average speed in kilometers per hour
        System.out.println("Average speed: " + speedKmph + " km/h");
    }
}
