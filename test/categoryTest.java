import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fdmgroup.controller.E_TicketingController;
import com.fdmgroup.models.Address;
import com.fdmgroup.models.Cart;
import com.fdmgroup.models.Category;
import com.fdmgroup.models.Ticket;

public class categoryTest {

private static Cart cart;
	
	private static E_TicketingController c;
	
	private static Ticket t1;
	
	private static Ticket t2;
	
	private static Ticket t3;
	
	private static Ticket t4;
	
	private static Address a1;
	
	private static Address a2;
	
	private static Address a3;
	
	private static Category cate1;
	
	private static Category cate2;
	
	
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
		
		cate1 = new Category("Movie");
		
		cate2 = new Category("NBA");
		
		c.getTickets().add(t1);
		c.getTickets().add(t2);
		c.getTickets().add(t3);
		c.getTickets().add(t4);
		
		//c.getTickets().add(e)
		
		cart = new Cart();
	}
	
	@Test
	public void testGetNumInStock(){
		cate1.setNumInStock(c.getTickets());
		cate2.setNumInStock(c.getTickets());
		assertEquals(3, cate1.getNumInStock(), 0.01);
		
		assertEquals(1, cate2.getNumInStock(), 0.01);
		
		
	}
}
