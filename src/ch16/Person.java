package ch16;

public class Person {
    String name;
    int money;

    public Person(String name, int money){
        this.name = name;
        this.money = money;

    }

    public void buyStar(StarCafe star) {
        star.Scllcoffee(4000);
        money -= 4000;
    }

    public void buyBin(BinCafe bin) {
        bin.ScllCoffee(4500);
        money -= 4500;
    }

    public void PersonInfo(){
        System.out.println(name + "님의 남은 돈은 " + money + "입니다." );
    }
}
