package chapter6.ch06;

import java.util.ArrayList;
import java.util.List;

public class CustomerTest {

    public static void main(String[] args) {

        List<Customer> list = new ArrayList<>();

        Customer kim = new Customer("김씨네");
        Customer lee = new GoldCustomer("이씨네");
        Customer park = new VIPCustomer("박씨네");

        list.add(kim);
        list.add(lee);
        list.add(park);

        for(Customer c : list) {
            System.out.println(c.getCustomerGrade() + c.calcPrice(10000));
            System.out.println(c.showCustomerInfo());
            System.out.println(c.getCustomerGrade() + c.calcPrice(10000));
        }
    }
}
