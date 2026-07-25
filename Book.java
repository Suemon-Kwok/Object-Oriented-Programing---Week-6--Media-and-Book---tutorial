// 1. Using the extends keyword in the class declaration of Book
public class Book extends Media {
    // 2. Declaring the private integer-typed instance variable numberOfPages
    private int numberOfPages;
    
    // 4. Book(String,int) constructor to initialise both instance variables
    public Book(String title, int numberOfPages) {
        // Call parent constructor to initialize title
        super(title);
        // Initialize numberOfPages
        this.numberOfPages = numberOfPages;
    }
    
    // 3. Get method for numberOfPages
    public int getNumberOfPages() {
        return numberOfPages;
    }
    
    // 5. toString method for Book
    @Override
    public String toString() {
        // Get the title string from parent class and add numberOfPages
        return super.toString() + "\nnumberOfPages = " + numberOfPages;
    }
}
