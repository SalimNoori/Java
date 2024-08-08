public class Book {
    private String title;
    private int pages;

    // Getter and setter methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create an instance of Book
        Book myBook = new Book();
        
        // Set title and pages
        myBook.setTitle("Java Programming");
        myBook.setPages(350);
        
        // Retrieve and display the title and pages
        System.out.println("Title: " + myBook.getTitle());
        System.out.println("Pages: " + myBook.getPages());
    }
}
