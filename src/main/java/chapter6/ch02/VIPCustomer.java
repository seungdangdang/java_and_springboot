package chapter6.ch02;

public class VIPCustomer extends Customer{

    private int agentID;
    double salesRatio;
    public VIPCustomer(String customerName) {
        super(customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    public int getAgentID() {
        return agentID;
    }
}
