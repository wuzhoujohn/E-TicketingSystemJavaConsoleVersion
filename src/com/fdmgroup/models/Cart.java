package com.fdmgroup.models;

import java.util.*;

import com.fdmgroup.controller.E_TicketingController;

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


	public void removeTicket(String id, E_TicketingController c) {
		// TODO Auto-generated method stub
		this.tickets.remove(c.findTicket(Integer.parseInt(id)));
		c.findTicket(Integer.parseInt(id)).setAvail(true);
	}
	
	
	
	
}
