/*Object oriented programming Lab 6 question 2
      
      Create and attach the Media class by
1.	Declaring the private String typed instance variable title
2.	Writing the constructor to initialise title with an input parameter
3.	Writing the get method for title
4.	Writing the toString method for Media (See example output)
Create the Book subclass of Media by
1.	Using the extends keyword in the class declaration of Book
2.	Declaring the private integer-typed instance variable numberOfPages
3.	Writing the get method for numberOfPages
4.	Writing the Book(String,int) constructor to initialise both instance variables with the input parameters
5.	Writing the toString method for Book

Test	Result
Media media = new Media("Title");
System.out.println(media);	title = Title

Media media = new Media("Title");
System.out.println("Testing get method: "+media.getTitle());	Testing get method: Title

Book book = new Book("My Book",100);
System.out.println(book);	title = My Book
numberOfPages = 100

Book book = new Book("Title",200);
System.out.println("Testing get method: "+book.getNumberOfPages());	Testing get method: 200


        
public class Book //subclass of Media
{


}
*/
public class Media {
    // 1. Declaring the private String typed instance variable title
    private String title;
    
    // 2. Constructor to initialise title with an input parameter
    public Media(String title) {
        this.title = title;
    }
    
    // 3. Get method for title
    public String getTitle() {
        return title;
    }
    
    // 4. toString method for Media
    @Override
    public String toString() {
        return "title = " + title;
    }
}
//------------------------------------------------------------------------------------------
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
