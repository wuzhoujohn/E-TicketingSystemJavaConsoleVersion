package com.fdmgroup.dto;

public class Ticket {
	
	private int ticketId;
	
	private String seatNum;
	
	private boolean avail;
	
	private String event;
	
	//private int numInStock;

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
