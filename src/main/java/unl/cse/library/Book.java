package unl.cse.library;

import java.time.LocalDate;

/**
 * This class models an individual book.
 *
 */
public class Book {

    private String title;
    private String isbn;
    private Author author;
    private LocalDate publishDate;

    public Book() { 
    }

    public Book(String title, Author author, String isbn, String publishDate) { 
        // TODO: write this method
    }

    /**
     * Getter method for author
     * @return
     */
    public Author getAuthor() {
        // TODO: write this method
        return null;
    }

    /**
     * Setter method for authors
     * @param author
     */
    public void setAuthor(Author author) {
        this.author = author;
    }

    /**
     * Getter method for call number.
     * @return
     */
    public String getISBN() {
        // TODO: write this method
        return null;
    }

    /**
     * Setter method for call number.
     * @param callNumber
     */
    public void setISBN(String isbn) {
        this.isbn = isbn;
    }

    /**
     * Getter method for title
     * @return
     */
    public String getTitle() {
        // TODO: write this method
        return null;
    }

    /**
     * Setter method for title
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter method for the publish date
     * @return publishDate
     */
    public String getPublishDate() {
    	return this.publishDate.toString();
    }
    
    /**
     * Setter method for the publish date
     * @param date
     */
    public void setPublishDate(String date) {
    	this.publishDate = LocalDate.parse(date);
    }
    
}
