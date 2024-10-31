package Task2;
import java.util.ArrayList;
import java.util.List;

class Customer {
 String customerId;
 private String name;
 private String address;
 private int phoneNo;
 private int age;
 private List<Ticket> tickets;

 public Customer(String customerId, String name, 
 String address, int phoneNo, int age) {
     this.customerId = customerId;
     this.name = name;
     this.address = address;
     this.phoneNo = phoneNo;
     this.age = age;
     this.tickets = new ArrayList<>(); 
 }

 public void addTicket(Ticket ticket) {
     tickets.add(ticket);
 }

 public List<Ticket> getTickets() {
     return tickets;
 }
}


