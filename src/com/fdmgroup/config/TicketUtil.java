package com.fdmgroup.config;

import java.util.ArrayList;
import java.util.List;

import com.fdmgroup.exceptions.TicketAlreadyExistException;
import com.fdmgroup.models.Ticket;

public abstract class TicketUtil {

	public boolean findTicket(int id, ArrayList<Ticket> al){
		for(Ticket t : al){
			if(t.getTicketId() == id){
				return true;
			}
		}
		return false;
	}
	
	public boolean addTicket(Ticket ticket, ArrayList<Ticket> al) throws TicketAlreadyExistException{
		for(Ticket t : al){
			if(findTicket(ticket.getTicketId(), al)){
				throw new TicketAlreadyExistException("Ticket Already Exist!");
			}
		}
		
		al.add(ticket);
		
		return true;
	}
	
	public boolean removeTicket(Ticket ticket, ArrayList<Ticket> al){
		return al.remove(ticket);
	}
	
	public List<Ticket> getAllAvailTickets(ArrayList<Ticket> al){
		List<Ticket> res = new ArrayList<Ticket>();
		for(Ticket t : al){
			if(t.isAvail()){
				res.add(t);
			}
		}
		
		return res;
	}
	
}
