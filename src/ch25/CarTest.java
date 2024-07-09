package ch25;

public class CarTest {
    public static void main(String[] args) {
        Car AiCar = new AiCar();
        AiCar.run();

        System.out.println("--------------------------");

        Car ManualCar = new ManualCar();
        ManualCar.run();
    }
}
