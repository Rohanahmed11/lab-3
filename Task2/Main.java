package Task2;
import java.util.Date;
public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setCustmerId("C002");
        customer.setName("Salman Khan");
        customer.setAddress("P-220 BLOCK N NORTH NAZIMABAD KARACHI");
        customer.setPhNo(123456789);
        customer.setAge(30);
        customer.addDetails();
        System.out.println("Customer details added");

        Agent agent = new Agent();
        agent.setId(1);
        agent.setName("Rohan");
        System.out.println("Agent Name: " + agent.getName());

        agent.searchTicket();
        System.out.println("Agent searched for a ticket.");
        agent.bookTicket();
        System.out.println("Agent booked a ticket.");

        Ticket ticket = new Ticket("KARACHI", "LAHORE", new Date(), "10:00 AM", "Bus123", "Seat22");
        System.out.println("Ticket booked from " + ticket.getSource() + " to " + ticket.getDestination());

        Refund refund = new Refund(50.50f , customer.getCustmerId());
        refund.refundAmount();
        System.out.println("Refund processed for customer: " + refund.getCustomerId() 
        + " with amount $" + refund.getAmount());
    }
}
