/**
 * The Textbook class is a subclass of the Book class.
 * It adds an additional field to store the grade level of the textbook.
 * It also provides getter and setter methods for the grade level field.
 */
public class Textbook extends Book {
    private int gradeLevel;

    /**
     * Retrieves the grade level of the textbook.
     * @return the grade level of the textbook
     */
    public int getGradeLevel() {
        return gradeLevel;
    }

    /**
     * Sets the grade level of the textbook.
     * @param gradeLevel the new grade level of the textbook
     */
    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
}