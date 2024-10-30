package Task2;
//Class representing an Agent that implements common functions
class Agent implements CommonFunctions {
 private int id;
 private String name;

 public Agent(int id, String name) {
     this.id = id;
     this.name = name;
 }

 @Override
 public void searchTicket() {
     System.out.println("Searching for tickets...");
 }

 @Override
 public void bookTicket() {
     System.out.println("Booking a ticket...");
 }

 @Override
 public void cancelTicket() {
     System.out.println("Cancelling a ticket...");
 }

 @Override
 public void makePayment() {
     System.out.println("Making payment...");
 }

 @Override
 public void fillDetails() {
     System.out.println("Filling details...");
 }
}
