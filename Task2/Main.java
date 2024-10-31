package Task2;
import java.util.Date;
public class Main {
 public static void main(String[] args) {
     Customer customer = new Customer("C001", "John Doe", "123 Main St", 1234567890, 30);
     Agent agent = new Agent(1, "Agent Smith");

     Ticket ticket = new Ticket("City A", "City B", new Date(), "10:00 AM", "Bus 123", "A1");
     customer.addTicket(ticket);

     agent.searchTicket();
     agent.bookTicket();
     agent.makePayment();

     System.out.println("Customer Tickets:");
     for (Ticket t : customer.getTickets()) {
         System.out.println(t);
     }

     Refund refund = new Refund(50.0f, customer.customerId);
     refund.refundAmount();
 }
}
