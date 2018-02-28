import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fdmgroup.controller.E_TicketingController;
import com.fdmgroup.models.Address;
import com.fdmgroup.models.Ticket;

public class ticketTest {
	private static E_TicketingController c;
	
	private static Ticket t1;
	
	private static Ticket t2;
	
	private static Ticket t3;
	
	private static Ticket t4;
	
	private static Address a1;
	
	private static Address a2;
	
	private static Address a3;
	
	//public
	
	@BeforeClass
	public static void setup(){
		c = new E_TicketingController();
	}
	
	@Before
	public void before(){
		a1 = new Address("Canada", "Quebec", "Montreal", "334 abc Blvd", "345ABC");
		
		a2 = new Address("United States", "New York", "New York City", "90 ame road", "M2O0AG");
		
		a3 = new Address("United States", "California", "Los Angelos", "110 rde St.", "M4JA5R");
		
		t1 = new Ticket(1, "1A", "Movie", a1, 79.9);
		
		t2 = new Ticket(2, "1B", "Movie", a2, 81.1);
		
		t3 = new Ticket(3, "2A", "Movie", a3, 90.5);
		
		t4 = new Ticket(7, "2B", "NBA", a2, 99.5);
		
	}
	
	@Test
	public void testPrice(){
		assertEquals(79.9, t1.getPrice(), 0.01);
		assertEquals(81.1, t2.getPrice(), 0.01);
		assertEquals(90.5, t3.getPrice(), 0.01);
		assertEquals(99.5, t4.getPrice(), 0.01);
	}
	
	@Test
	public void testSetAvail(){
		assertTrue("ticket1 is availble", t1.isAvail());
		assertTrue("ticket2 is availble", t2.isAvail());
		assertTrue("ticket3 is availble", t3.isAvail());
		assertTrue("ticket4 is availble", t4.isAvail());
	}
	
	
}
