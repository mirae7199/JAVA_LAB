package ch16;

public class StarCafe {
    String name;
    int money;
    int customer;

    public void Scllcoffee(int money){
        this.money += money;
        customer++;
    }

    public void StarCafeInfo() {
        System.out.println(name + "는 수입은 " + money + "이고, 손님은 " + customer +
                "명 있습니다.");
    }
}
