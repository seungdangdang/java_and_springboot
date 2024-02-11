package chapter6.ch06;

public class GoldCustomer extends Customer{

    double salesRatio;
    public GoldCustomer(String customerName) {
        super(customerName);
        customerGrade = "GOLD";

        salesRatio = 0.1;
        bonusRatio = 0.02;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return (int) (price - (price * salesRatio));
    }
}
