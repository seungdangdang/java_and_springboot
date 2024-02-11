package chapter6.ch02;

public class CustomerTest {

    public static void main(String[] args) {

        int productPrice = 10000;

        Customer customerLee = new Customer("이순신");
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());
        System.out.println(customerLee.getCustomerName()+"의 제품 금액은 " + customerLee.calcPrice(productPrice));

        Customer customerYun = new Customer("윤");
        customerYun.bonusPoint = 1000;
        System.out.println(customerYun.showCustomerInfo());

        VIPCustomer customerHong = new VIPCustomer("홍길동");
        customerHong.bonusPoint = 10000;
        System.out.println(customerHong.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer("김유신");
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());
        System.out.println(customerKim.getCustomerName()+"의 제품 금액은 " + customerKim.calcPrice(productPrice));
    }
}
