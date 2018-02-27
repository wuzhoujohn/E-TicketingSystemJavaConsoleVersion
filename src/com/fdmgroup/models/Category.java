package com.fdmgroup.models;

import java.util.*;

public class Category {
	
	private String eventName;
	
	//private List<Ticket> eventTickets;
	
	private boolean categoryAvail;
	
	//private int numInStock;
	
	public Category(String eventName) {
		super();
		this.eventName = eventName;
		//this.eventTickets = new ArrayList<Ticket>();
		this.categoryAvail = true;
		//this.numInStock = 0;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

/*	public List<Ticket> getEventTickets() {
		return eventTickets;
	}

	public void setEventTickets(List<Ticket> eventTickets) {
		this.eventTickets = eventTickets;
	}*/

	public boolean isCategoryAvail() {
		return categoryAvail;
	}

	public void setCategoryAvail(boolean categoryAvail) {
		this.categoryAvail = categoryAvail;
	}
	
	

}