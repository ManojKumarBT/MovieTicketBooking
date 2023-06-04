package com.moviebookingapp.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.moviebookingapp.exception.MovieNotAvailableException;
import com.moviebookingapp.exception.NoTicketBookedException;
import com.moviebookingapp.models.Tickets;

@Service
public interface TicketService {
	public String bookTickets(Tickets tickets) throws MovieNotAvailableException;
	//public String ticketStatus(String movieName);
	public int viewBookedTickets(String movieName,String theatreName) throws NoTicketBookedException;

}
