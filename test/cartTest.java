import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fdmgroup.controller.E_TicketingController;
import com.fdmgroup.models.Address;
import com.fdmgroup.models.Cart;
import com.fdmgroup.models.Ticket;

public class cartTest {
	private static Cart cart;
	
	private static E_TicketingController c;
	
	private static Ticket t1;
	
	private static Ticket t2;
	
	private static Ticket t3;
	
	private static Ticket t4;
	
	private static Address a1;
	
	private static Address a2;
	
	private static Address a3;
	
	@BeforeClass
	public static void setup(){
		c = new E_TicketingController();
	}
	
	@Before
	public void initial(){
		a1 = new Address("Canada", "Quebec", "Montreal", "334 abc Blvd", "345ABC");
		
		a2 = new Address("United States", "New York", "New York City", "90 ame road", "M2O0AG");
		
		a3 = new Address("United States", "California", "Los Angelos", "110 rde St.", "M4JA5R");
		
		t1 = new Ticket(1, "1A", "Movie", a1, 79.9);
		
		t2 = new Ticket(2, "1B", "Movie", a2, 81.1);
		
		t3 = new Ticket(3, "2A", "Movie", a3, 90.5);
		
		t4 = new Ticket(7, "2B", "NBA", a2, 99.5);
		
		c.getTickets().add(t1);
		c.getTickets().add(t2);
		c.getTickets().add(t3);
		c.getTickets().add(t4);
		
		//c.getTickets().add(e)
		
		cart = new Cart();
	}
	
	@Test
	public void testAdd(){	
		assertTrue("ticket 1 added to cart", cart.getTickets().add(t1));
		assertTrue("ticket 2 added to cart", cart.getTickets().add(t2));
		assertTrue("ticket 3 added to cart", cart.getTickets().add(t3));
		assertTrue("ticket 4 added to cart", cart.getTickets().add(t4));
	}
	
	@Test
	public void testRemove(){
		int counter = 4;
		for(Ticket t : cart.getTickets()){
			cart.removeTicket(t.getTicketId() + " ", c);
			assertEquals(counter--, cart.getTickets().size(), 0.01);
		}
	}
	
	
	
}
