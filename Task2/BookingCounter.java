package Task2;

import java.util.ArrayList;
import java.util.List;

class BookingCounter {
 private List<Ticket> bookedTickets;

 public BookingCounter() {
     bookedTickets = new ArrayList<>(); 
 }

 public void addBookedTicket(Ticket ticket) {
     bookedTickets.add(ticket);
 }

 public List<Ticket> getBookedTickets() {
     return bookedTickets;
 }
}
