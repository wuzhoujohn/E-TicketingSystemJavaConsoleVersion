import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fdmgroup.models.Cart;
import com.fdmgroup.models.Ticket;

public class cartTest {
	private static Cart cart;
	private static Ticket ticket1;
	private static Ticket ticket2;
	
	@BeforeClass
	public static void setup(){
		cart = new Cart();
	}
	
	@Before
	public void initial(){
		
	}
	
	@Test
	public void testAdd(){
		
	}
}
