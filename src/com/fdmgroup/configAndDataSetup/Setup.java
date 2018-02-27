package com.fdmgroup.configAndDataSetup;

import java.util.ArrayList;
import java.util.List;

import com.fdmgroup.models.Address;
import com.fdmgroup.models.Category;
import com.fdmgroup.models.Ticket;

public class Setup {
	
	public List<Category> configCategory(){
		List<Category> cats = new ArrayList<Category>(); 
				
		Category cate1 = new Category("Movie");
		
		Category cate2 = new Category("NBA");
		
		Category cate3 = new Category("Concert");
		
		Category cate4 = new Category("Baseball");
		
		
		cats.add(cate1);
		
		cats.add(cate2);
		
		cats.add(cate3);
		
		cats.add(cate4);
		
		return cats;
	}


	public List<Ticket> configTicket() {
		// TODO Auto-generated method stub
		List<Ticket> tickets = new ArrayList<Ticket>();
		
		Address address1 = new Address("Canada", "Ontario", "Toronto", "110 Yonge St.", "123456");
		
		Address address2 = new Address("Canada", "Alberta", "Calgary", "11 abc Ave", "345ABC");
		
		Address address3 = new Address("Canada", "Quebec", "Montreal", "334 abc Blvd", "345ABC");
		
		Address address4 = new Address("United States", "New York", "New York City", "90 ame road", "M2O0AG");
		
		Address address5 = new Address("United States", "California", "Los Angelos", "110 rde St.", "M4JA5R");
		
		Address address6 = new Address("Canada", "Ontario", "Toronto", "119 abc Ave", "349ABC");
		
		Address address7 = new Address("China", "Beijing", "Beijing", "110 chaoyang St.", "272000");
		
		Address address8 = new Address("Canada", "Ontario", "Waterloo", "89 sheppard ave", "387ABC");
		
		Address address9 = new Address("United States", "Texas", "Houston", "56 infor St.", "5A78Y6");
		
		Address address10 = new Address("Canada", "British Columbia", "Vancouver", "46 jhn Ave", "U4F9FA");
		
		Ticket ticket1 = new Ticket(1, "1A", "Movie", address1, 79.9);
		
		Ticket ticket2 = new Ticket(2, "1B", "Movie", address1, 81.1);
		
		Ticket ticket3 = new Ticket(3, "2A", "Movie", address1, 90.5);
		
		Ticket ticket4 = new Ticket(4, "2B", "Movie", address1, 100);
		
		Ticket ticket5 = new Ticket(5, "1A", "NBA", address2, 102);
		
		Ticket ticket6 = new Ticket(6, "2A", "NBA", address3, 100);
		
		Ticket ticket7 = new Ticket(7, "2B", "NBA", address4, 99.5);
		
		Ticket ticket8 = new Ticket(8, "1C", "Concert", address5, 45);
		
		Ticket ticket9 = new Ticket(9, "1D", "Concert", address5, 67);
		
		Ticket ticket10 = new Ticket(10, "1E", "Concert", address5, 234.5);
		
		Ticket ticket11 = new Ticket(11, "2A", "Baseball", address6, 239.5);
		
		Ticket ticket12 = new Ticket(12, "3B", "Baseball", address6, 256.5);
		
		tickets.add(ticket1);
		
		tickets.add(ticket2);
		
		tickets.add(ticket3);
		
		tickets.add(ticket4);
		
		tickets.add(ticket5);
		
		tickets.add(ticket6);
		
		tickets.add(ticket7);
		
		tickets.add(ticket8);
		
		tickets.add(ticket9);
		
		tickets.add(ticket10);
		
		tickets.add(ticket11);
		
		tickets.add(ticket12);
		
		return tickets;
	}
}
