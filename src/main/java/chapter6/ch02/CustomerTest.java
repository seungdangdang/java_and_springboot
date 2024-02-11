package chapter6.ch02;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customerLee = new Customer("이순신");
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        Customer customerYun = new Customer("윤");
        customerYun.bonusPoint = 1000;
        System.out.println(customerYun.showCustomerInfo());

        VIPCustomer customerHong = new VIPCustomer("홍길동");
        customerHong.bonusPoint = 10000;
        System.out.println(customerHong.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer("김유신");
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());
    }
}
