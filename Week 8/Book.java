/**
 * The Book class represents a book with a title and number of pages.
 * It provides getter and setter methods for the title and pages fields.
 */
public class Book {
    private String title;
    private int pages;

    /**
     * Retrieves the title of the book.
     * @return the title of the book
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the book.
     * @param title the new title of the book
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Retrieves the number of pages in the book.
     * @return the number of pages in the book
     */
    public int getPages() {
        return pages;
    }

    /**
     * Sets the number of pages in the book.
     * @param pages the new number of pages in the book
     */
    public void setPages(int pages) {
        this.pages = pages;
    }
}