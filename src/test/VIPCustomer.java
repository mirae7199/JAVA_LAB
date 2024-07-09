package test;

public class VIPCustomer extends Customer{
    private static int AgentID = 1000;
    double saleRatio;

    public VIPCustomer() {
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        AgentID++;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int)(price * saleRatio);
        return price;
    }

    public String showCusotmerInfo() {
        return customerName+ " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는" +
                bonusPoint + "입니다.";
    }
}
