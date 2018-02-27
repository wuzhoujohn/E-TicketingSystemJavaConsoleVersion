package com.fdmgroup.models;

import java.util.*;

public class Cart {
	private int cartId;
	
	private int userSIN;
	
	private List<Ticket> tickets;

	
	/**
	 * 
	 */
	public Cart() {
		super();
		tickets = new ArrayList<Ticket>();
	}
	
	
	@Override
	public String toString() {
		return "Cart [tickets=" + tickets + "]";
	}


	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getUserSIN() {
		return userSIN;
	}

	public void setUserSIN(int userSIN) {
		this.userSIN = userSIN;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}
	
	
	
	
}
