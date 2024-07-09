package ch22;

public class VIPCustomer extends Customer {

    private static int agentID = 10000;
    double salesRatio;

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName); // 상위 클래스 생성자가 먼저 생성 된다...
        customerGrade = "VIP";
        salesRatio = 0.1;
        bonusRatio = 0.05;
        agentID++;

        System.out.println("VIPCustomer(int, String) call");
    }

    public int getAgentID(){
            return agentID;
    }

    @Override
    public int calcPrice(int price) {

        bonusPoint += price * bonusRatio;
        price -= (int)(price * salesRatio);
        return price;
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo() + " 상담원 아이디는 " + agentID;
    }
}
