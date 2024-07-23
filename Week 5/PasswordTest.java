import java.util.Scanner;

/**
 * PasswordTest.java
 * This program accepts a string from the user and evaluates it as a password.
 * It checks if the password meets the following criteria:
 * 1. At least 8 characters long
 * 2. Contains at least one lowercase letter
 * 3. Contains at least one uppercase letter
 * 4. Contains at least one digit
 * 5. Contains at least one character that is neither a letter nor a digit
 * The program then displays the entered password and its verdict (Valid or Invalid).
 */
public class PasswordTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for password
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        // Evaluate the password
        boolean isValid = evaluatePassword(password);

        // Display results
        System.out.println("Entered Password: " + password);
        System.out.println("Verdict:          " + (isValid ? "Valid" : "Invalid"));

        scanner.close();
    }

    /**
     * Evaluates the given password against the specified criteria.
     * @param password The password to evaluate
     * @return true if the password is valid, false otherwise
     */
    private static boolean evaluatePassword(String password) {
        // Check length
        if (password.length() < 8) {
            return false;
        }

        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        // Check each character in the password
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
        }

        // Return true only if all criteria are met
        return hasLowerCase && hasUpperCase && hasDigit && hasSpecialChar;
    }
}