package unl.cse.library;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

/**
 * This is a suite of tests for the {@link #Book} class.
 * The compiler errors should be addressed once you've completed the lab.  
 * 
 */
public class BookTests {

	/**
	 * Tests that {@link #Book} class has the appropriate constructor and getters.
	 */
	@Test
	public void bookFixedTest01() {
		Book b = new Book("Three Body Problem", null, "978-7-5366-9293-0", "2008-01-01");
		Assertions.assertEquals("Three Body Problem", b.getTitle());
		Assertions.assertEquals("978-7-5366-9293-0", b.getISBN());
	}

	@Test
	public void bookFixedTest02() {
		Book b = new Book("War and Peace", null, "978-0199232765", "1869-01-01");
		Assertions.assertEquals("War and Peace", b.getTitle());
		Assertions.assertEquals("978-0199232765", b.getISBN());
	}
	

}
