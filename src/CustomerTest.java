import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerTest {

	@Test
	void testStatement() {
		Movie movie1 = new Movie("movie1", 1);
		Movie movie2 = new Movie("movie2", 2);
		Customer customer1 = new Customer("customer1");
		Customer customer2 = new Customer("customer2");
		customer1.addRental(new Rental(movie1, 10));
		customer1.addRental(new Rental(movie2, 20));
		customer2.addRental(new Rental(movie1, 10));
		assertEquals("Rental Record for customer1\n" + 
				"	movie1	30.0\n" + 
				"	movie2	27.0\n" + 
				"Amount owed is 57.0\n" + 
				"You earned 3 frequent renter points", customer1.statement());
		assertEquals("Rental Record for customer2\n" + 
				"	movie1	30.0\n" + 
				"Amount owed is 30.0\n" + 
				"You earned 2 frequent renter points", customer2.statement());
	}

}
