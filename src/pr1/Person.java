package pr1;

import ch16.StarCafe;
import test.Student;

public class Person {
    String name;
    int money;

    Person(String name, int money) {
        this.money = money;
        this.name = name;
    }

    public void buyStarCoffee(StarCoffee sCoffee, int money) {
        String message = sCoffee.bewing(money);
        if(message != null) {
            this.money -= money;
            System.out.println(name + "님이 " + money + "으로 " + message);
        }
    }

    public void buyBeanCoffee(BeanCoffee bCoffee, int money) {
        String message = bCoffee.bewing(money);
        if(message != null) {
            this.money -= money;
            System.out.println(name + "님이 " + money + "으로 " + message);
        }
    }


}
