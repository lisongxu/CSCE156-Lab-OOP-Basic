package unl.soc;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

/**
 * This is a suite of tests for the {@link #Author} class.
 * The compiler errors should be addressed once you've completed the lab.  
 * 
 */
public class AuthorTests {

	/**
	 * Tests that {{@link #Author} class has the appropriate constructor and
	 * getters.
	 */
	@Test
	public void authorFixedTest01() {
		Author a = new Author("First", "Last");
		Assertions.assertEquals("First", a.getFirstName());
		Assertions.assertEquals("Last", a.getLastName());
	}

	/**
	 * Tests that {{@link #Author} class has the appropriate constructor and
	 * getters.
	 */
	@Test
	public void authorFixedTest02() {
		Author a = new Author();
		a.setFirstName("First");
		Assertions.assertEquals("First", a.getFirstName());
	}

	/**
	 * Tests that {{@link #Author} class has the appropriate constructor and
	 * getters.
	 */
	@Test
	public void authorFixedTest03() {
		Author a = new Author();
		a.setLastName("Last");
		Assertions.assertEquals("Last", a.getLastName());
	}

	
}
