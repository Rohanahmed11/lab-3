package Task2;
public class Agent implements CommonFunctions {
    private int id;
    private String name;

    @Override
    public void searchTicket() {
        System.out.println("Agent " + name + " is searching for tickets.");
    }

    @Override
    public void bookTicket() {
        System.out.println("Agent " + name + " is booking a ticket.");
    }

    @Override
    public void cancelTicket() {
        System.out.println("Agent " + name + " is canceling a ticket.");
    }

    @Override
    public void makePayment() {
        System.out.println("Agent " + name + " is making a payment.");
    }

    @Override
    public void fillDetail() {
        System.out.println("Agent " + name + " is filling details.");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
