public class Practice_1_2 {
    public static void main(String[] args) {
        // Define the first name
        String firstName = "Salim";
        // Define the last name
        String lastName = "Noori";

        // Get the initial of the last name (first character of the last name)
        char lastNameInitial = lastName.charAt(0);

        // Print out the initials by combining the first character of the first name
        // and the first character of the last name
        System.out.println("Initial is " + firstName.charAt(0) + lastNameInitial);
    }
}
