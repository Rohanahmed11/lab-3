package Task2;
class Refund {
 private float amount;
 private String customerId;

 public Refund(float amount, String customerId) {
     this.amount = amount;
     this.customerId = customerId;
 }

 public void refundAmount() {
     System.out.println("Refunding " + amount + 
      " to customer " + customerId);
 }
}
