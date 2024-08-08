/**
 * The DemoBook class demonstrates the use of the Book and Textbook classes.
 * It creates instances of both classes, sets their properties, and prints the information.
 */
public class DemoBook {
    public static void main(String[] args) {
        // Create a Book object
        Book book1 = new Book();
        book1.setTitle("The Shining");
        book1.setPages(450);

        // Create a Textbook object
        Textbook book2 = new Textbook();
        book2.setTitle("Arithmetic");
        book2.setPages(200);
        book2.setGradeLevel(4);

        // Print the information about the books
        System.out.println("Book 1 is " + book1.getTitle() + " with " + book1.getPages() + " pages.");
        System.out.println("Book 2 is " + book2.getTitle() + " with " + book2.getPages() + " pages. It is for grade level " + book2.getGradeLevel() + ".");
    }
}