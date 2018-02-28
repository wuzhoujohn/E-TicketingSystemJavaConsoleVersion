package com.fdmgroup.models;

public class Ticket {
	
	private int ticketId;
	
	private String seatNum;
	
	private boolean avail;
	
	private String event;
	
	private Address address;
	
	private double price;
	
	//private int numInStock;
	
	

	public Address getAddress() {
		return address;
	}

	public Ticket(int ticketId, String seatNum, String event, Address address, double price) {
		super();
		this.ticketId = ticketId;
		this.seatNum = seatNum;
		this.avail = true;
		this.event = event;
		this.address = address;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId:" + ticketId + ", seatNum:" + seatNum + ", price:" + price + ", " + address + "]";
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public String getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(String seatNum) {
		this.seatNum = seatNum;
	}

	public boolean isAvail() {
		return avail;
	}

	public void setAvail(boolean avail) {
		this.avail = avail;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}
	

}
