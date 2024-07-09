package ch23;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {

        int price = 10000;
        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;
        int cost = customerLee.calcPrice(price);
        System.out.println(customerLee.showCustomerInfo() + "지불 금액은 " + cost + "입니다.");

        VIPCustomer customerKim = new VIPCustomer(10020, "김춘추");
        customerKim.bonusPoint = 10000;
        customerKim.calcPrice(price);
        cost = customerKim.calcPrice(price);
        System.out.println(customerKim.showCustomerInfo() + " 지불 금액은 " + cost + "입니다.");

        Customer customerPark = new VIPCustomer(10030, "박혁거세");
        customerPark.bonusPoint = 1000;
        cost = customerPark.calcPrice(price);
        System.out.println(customerPark.showCustomerInfo() + " 지불 금액은 " + cost + "입니다.");

        Customer customerSeo = new GoldCustomer(10040, "소재영");
        customerPark.bonusPoint = 1000;
        cost = customerSeo.calcPrice(price);
        System.out.println(customerSeo.showCustomerInfo() + " 지불 금액은 " + cost + "입니다.");

        ArrayList<Customer> customerArray = new ArrayList<Customer>();

        customerArray.add(customerLee);
        customerArray.add(customerKim);
        customerArray.add(customerPark);
        customerArray.add(customerSeo);

        System.out.println("==================================");

        for(Customer customers : customerArray) {
            System.out.println(customers.showCustomerInfo());
        }

    }
}
