package chapter6.ch06;

public class VIPCustomer extends Customer {

    private int agentID;
    double salesRatio;
    public VIPCustomer(String customerName) {
        super(customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return (int) (price - (price * salesRatio));
    }

    public int getAgentID() {
        return agentID;
    }
}
