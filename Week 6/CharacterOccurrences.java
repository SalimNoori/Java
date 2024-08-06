import java.util.Scanner;

public class CharacterOccurrences {
    
    /**
     * Counts the number of occurrences of a specified character in a given string.
     * 
     * @param str The string in which to count occurrences.
     * @param a The character to count in the string.
     * @return The number of occurrences of the specified character.
     */
    public static int count(String str, char a) {
        int count = 0;
        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Increment count if the current character matches the specified character
            if (str.charAt(i) == a) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        // Calculate the number of occurrences of the specified character
        int occurrences = count(inputString, inputChar);
        // Display the result to the user
        System.out.println("The character '" + inputChar + "' occurs " + occurrences + " time(s) in the string.");

        // Display example usage of the count method with different inputs
        System.out.println("\nExamples with random characters:");
        System.out.println("count(\"Hello World\", 'x'): " + count("Hello World", 'x'));
        System.out.println("count(\"Programming is fun\", 'p'): " + count("Programming is fun", 'p'));
        System.out.println("count(\"Java is awesome\", 'k'): " + count("Java is awesome", 'k'));

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
