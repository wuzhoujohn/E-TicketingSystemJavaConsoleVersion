package com.fdmgroup.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.fdmgroup.configAndDataSetup.Setup;
import com.fdmgroup.models.Address;
import com.fdmgroup.models.Category;
import com.fdmgroup.models.Ticket;

public class E_TicketingController {
	private List<Category> cats;
	
	private List<Ticket> tickets;
	
	private Setup setup = new Setup();
	
	public Setup getSetup() {
		return setup;
	}


	public void setSetup(Setup setup) {
		this.setup = setup;
	}


	public List<Category> getCats() {
		return cats;
	}


	public void setCats(List<Category> cats) {
		this.cats = cats;
	}


	public List<Ticket> getTickets() {
		return tickets;
	}


	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}


	public static void main(String[] args) {
		E_TicketingController controller = new E_TicketingController();

		controller.setCats(controller.getSetup().configCategory());
		
		controller.setTickets(controller.getSetup().configTicket());	
		
		System.out.println("Welcome to the E-Ticketing System!!");
		System.out.println("Here are the available events and available number of tickets");
		for(Category c : controller.getCats()){
			int numInStock = 0;
			for(Ticket t : controller.getTickets()){
				if(t.getEvent().equalsIgnoreCase(c.getEventName()) && t.isAvail()){
					numInStock++;
				}
			}
			System.out.println(c.getEventName() + ":Number of tickets Available: " + numInStock);
			System.out.println("	Ticket details for event " + c.getEventName() + " :");
			for(Ticket t: controller.getTickets()){
				if(t.getEvent().equalsIgnoreCase(c.getEventName()) && t.isAvail()){
					System.out.println("	" + t.toString());;
				}
			}
		}
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Please pick an event you are interested: ");
		String option = reader.nextLine();
		
		
		
	}
}
