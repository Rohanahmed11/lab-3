package Task2;

import java.util.ArrayList;
import java.util.List;

//Class for managing bookings at the counter
class BookingCounter {
 private List<Ticket> bookedTickets;

 public BookingCounter() {
     bookedTickets = new ArrayList<>(); // Initialize the list
 }

 public void addBookedTicket(Ticket ticket) {
     bookedTickets.add(ticket);
 }

 public List<Ticket> getBookedTickets() {
     return bookedTickets;
 }
}