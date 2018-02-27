package com.fdmgroup.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.fdmgroup.configAndDataSetup.Setup;
import com.fdmgroup.models.Address;
import com.fdmgroup.models.Cart;
import com.fdmgroup.models.Category;
import com.fdmgroup.models.Ticket;
import com.fdmgroup.validations.inputValidation;

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
		//update number in stock for each category after setting up all the tickets
		for(Category c : cats){
			c.setNumInStock(tickets);
		}
	}
	
	public Category findCategory(String catName){
		for(Category c : cats){
			if(c.getEventName().equalsIgnoreCase(catName)){
				return c;
			}
		}
		return null;
	}
	
	public void displayCats(){
		for(Category c : cats){
			System.out.println(c.getEventName() + ":	[Available Tickets in Stock: " + this.getNumTicketInCat(c.getEventName()) + "]");
		}
	}
	
	public void displayCatTickets(String catName){
		for(Ticket t : this.tickets){
			if(t.getEvent().equalsIgnoreCase(catName) && t.isAvail()){
				System.out.println("	" + t.toString());
			}
		}
	}
	
	private int getNumTicketInCat(String catName){
			int numInStock = 0;
			//System.out.print(c.getEventName() + ":");
			for(Ticket t : this.tickets){
				if(t.getEvent().equalsIgnoreCase(catName) && t.isAvail()){
					//System.out.println("	" + t.toString());
					numInStock++;
				}
			}
			return numInStock;
			//System.out.println("	[Number of tickets in stock: " + numInStock + "]");
	}
	
	public Ticket findTicket(int id){
		for(Ticket t : tickets){
			if(t.getTicketId() == id){
				return t;
			}
		}
		return null;
	}
	
	private ArrayList<String> selectTickets(int numRequested, inputValidation iv) {
		// TODO Auto-generated method stub
		System.out.println("Please type the ticket id now, type one id at a time, press enter when you finish typing one id");
		Scanner sc = new Scanner(System.in);
		//String seat = sc.nextLine();
		ArrayList<String> res = new ArrayList<String>();
		for(int i = 0; i < numRequested; i++){
			String seat = sc.nextLine();
			while(!iv.validateSeats(seat, tickets)){
				System.err.println("ticket id is invalid");
			};
			//res[i] = seat;
			
		}
		return res;
	}
	
	private double checkOut(Cart cart) {
		// TODO Auto-generated method stub
		double charge = 0.0;
		for(Ticket t : cart.getTickets()){
			charge += t.getPrice();
		}
		
		return charge;
	}


	public static void main(String[] args) {
		
		E_TicketingController controller = new E_TicketingController();
		
		inputValidation iv = new inputValidation();

		controller.setCats(controller.getSetup().configCategory());
		
		controller.setTickets(controller.getSetup().configTicket());
		
		Cart cart = new Cart();
		
		Scanner reader = new Scanner(System.in);
		//display all available events and their associated tickets
		System.out.println("Welcome to the E-Ticketing System!!");
		System.out.println("Here are the available events");
		
		String decision = "Continue Shopping";
		
		while(decision.equalsIgnoreCase("continue Shopping")){
			controller.displayCats();	
			
			System.out.println("Please pick an event you are interested: ");
			String option = reader.nextLine();
			while(!iv.validateOption(option)){
				System.out.println("Event you typed is not valid, please type movie, nba, concert, or baseball for preceding");
				option = reader.nextLine();
			}
			
			System.out.print("You have picked " + option);
			
			if(controller.findCategory(option).getNumInStock() == 0){
				System.err.println(" " + option + " is out of stock, you can select a different event");
				continue;
			}
			
			System.out.println(" Here are all the tickets associated with it");
			
			controller.displayCatTickets(option);
			
			System.out.println("Please type a number for how many tickets you are buying");
			//controller.displayCatTickets(option);
			String num = reader.nextLine();
			
			while(!iv.validateNumber(num)){
				System.out.println("This is a invalid number format, please re-enter the number");
				num = reader.nextLine();
			}
			
			if(Integer.parseInt(num) > controller.findCategory(option).getNumInStock()){
				System.err.println("The number of tickets you are requiring exceeds the number in stock.");
			}else{
				//get number of ticket requested
				int numRequested = Integer.parseInt(num);
				//create an arrying that holds all the ticket ids
				ArrayList<String> seats = controller.selectTickets(numRequested, iv);
				
				//System.out.println("ticket ids are" + seats.toString());
				//validate id array
/*				if(iv.validateSeats(seats, controller, option)){
					//create cart
					
					//add the tickets user just picked
					for(String seat : seats){
						int id = Integer.parseInt(seat);
						//add ticket to cart
						cart.getTickets().add(controller.findTicket(id));
						//set ticket to unavailable
						controller.findTicket(id).setAvail(false);
						//update the category stock
						controller.findCategory(option).setNumInStock(controller.getTickets());
					}
					
					System.out.println("Do you want to continue shopping(y/n)?");
					String dc = reader.nextLine();
					//if dc starts y or Y it will continue shopping, otherwise, it will jump out of the loop
					if(dc.matches("^[y|Y].*")){
						decision = "continue shopping";
					}else{
						break;
					}
					
				}else{
					//do nothing, display which ticket Id is wrong
				}*/
				
			}
		}
		
		controller.checkOut(cart);
		
		
		
		
	}




}
