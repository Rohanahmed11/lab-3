package Task2;
public class Customer {
    private String custmerId;
    private String name;
    private String address;
    private int phNo;
    private int age;

    public void addDetails() {
        System.out.println("Adding details for customer " + name);
    }

    public void modifyDetails() {
        System.out.println("Modifying details for customer " + name);
    }

    // Getters and Setters
    public String getCustmerId() {
        return custmerId;
    }

    public void setCustmerId(String custmerId) {
        this.custmerId = custmerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhNo() {
        return phNo;
    }

    public void setPhNo(int phNo) {
        this.phNo = phNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
