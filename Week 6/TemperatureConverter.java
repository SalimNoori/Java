/**
 * TemperatureConverter class provides methods to convert temperatures
 * between Celsius and Fahrenheit. It includes conversion methods and
 * a main method to display a combined conversion table.
 */
public class TemperatureConverter {
    /**
     * Converts a temperature from Celsius to Fahrenheit.
     *
     * @param celsius Temperature in Celsius.
     * @return The equivalent temperature in Fahrenheit.
     */
    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    /**
     * Converts a temperature from Fahrenheit to Celsius.
     *
     * @param fahrenheit Temperature in Fahrenheit.
     * @return The equivalent temperature in Celsius.
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }

    /**
     * Main method to display a combined conversion table for
     * Celsius to Fahrenheit and Fahrenheit to Celsius.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        System.out.println("Celsius     Fahrenheit   |   Fahrenheit     Celsius");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            double celsius = 40.0 - i;
            double fahrenheitFromC = celsiusToFahrenheit(celsius);
            double fahrenheitForC = 120.0 - (i * 10);
            double celsiusFromF = fahrenheitToCelsius(fahrenheitForC);

            System.out.printf("%-11.1f%-13.1f|   %-13.1f%-7.2f%n", 
                              celsius, fahrenheitFromC, fahrenheitForC, celsiusFromF);
        }
    }
}