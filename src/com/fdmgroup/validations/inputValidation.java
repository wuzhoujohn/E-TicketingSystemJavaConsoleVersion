package com.fdmgroup.validations;

import java.util.List;

import com.fdmgroup.controller.E_TicketingController;
import com.fdmgroup.exceptions.InvalidTicketIdException;
import com.fdmgroup.models.Ticket;

public class inputValidation {
	
	public boolean validateOption(String option){
		if(option.equalsIgnoreCase("movie") || option.equalsIgnoreCase("baseball") || option.equalsIgnoreCase("concert") || option.equalsIgnoreCase("nba")){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean validateNumber(String num) {
		// TODO Auto-generated method stub
		try{
			int res = Integer.parseInt(num);
			return true;
		}catch(NumberFormatException e){
			return false;
		}
		
	}

/*	public boolean validateSeats(String[] seats, E_TicketingController c, String option) {
		// TODO Auto-generated method stub
		int i = 0;
		try{
			for(; i < seats.length; i++){
				int res = Integer.parseInt(seats[i]);
				//System.out.println("id is " + res);
				//if no ticket with this id exist or the category of ticket with the id is not equal to option, throw invalidTicketIdException
				if(c.findTicket(res) == null){
					throw new InvalidTicketIdException("ticket with id " + res + " does not exist, " + "appliation closed, thanks for shopping with us");
				}else{
					if(!c.findTicket(res).getEvent().equalsIgnoreCase(option)){
						throw new InvalidTicketIdException("ticket with id " + res + " exists, but it belongs to a different category: " + c.findTicket(res).getEvent() + " application closed, thanks for shopping with us");
					}
				}
			}		
			return true;
		}catch(NumberFormatException e){
			System.err.println(seats[i] + " is not a valid Ticket Id");
			return false;
		}catch(InvalidTicketIdException ie){
			System.err.println(ie.getMessage());
			return false;
		}
	}*/

	public boolean validateSeats(String id, E_TicketingController c, String option) {
		// TODO Auto-generated method stub
		int i = 0;
		try{
			int res = Integer.parseInt(id);
			//System.out.println("id is " + res);
			//if no ticket with this id exist or the category of ticket with the id is not equal to option, throw invalidTicketIdException
			if(c.findTicket(res) == null){
				throw new InvalidTicketIdException("ticket with id " + res + " does not exist! ");
			}else{
				if(!c.findTicket(res).getEvent().equalsIgnoreCase(option)){
					throw new InvalidTicketIdException("ticket with id " + res + " exists, but it belongs to a different category: " + c.findTicket(res).getEvent());
				}
			}		
			return true;
		}catch(NumberFormatException e){
			System.err.println(id + " is not a valid Ticket Id");
			return false;
		}catch(InvalidTicketIdException ie){
			System.err.println(ie.getMessage());
			return false;
		}
	}

	public boolean validateSeatForCart(String id, E_TicketingController c) {
		// TODO Auto-generated method stub
		int i = 0;
		try{
			int res = Integer.parseInt(id);
			//System.out.println("id is " + res);
			//if no ticket with this id exist or the category of ticket with the id is not equal to option, throw invalidTicketIdException
			if(c.findTicket(res) == null){
				throw new InvalidTicketIdException("ticket with id " + res + " does not exist!!");
				}	
			return true;
		}catch(NumberFormatException e){
			System.err.println(id + " is not a valid Ticket Id");
			return false;
		}catch(InvalidTicketIdException ie){
			System.err.println(ie.getMessage());
			return false;
		}
	}
}

	
