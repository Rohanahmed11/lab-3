package Task2;
public class Refund {
    private float amount;
    private String customerId;

    public Refund(float amount, String customerId) {
        this.amount = amount;
        this.customerId = customerId;
    }

    public void refundAmount() {
        System.out.println("Processing refund for customer ID " 
        + customerId + " with amount $" + amount);
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
