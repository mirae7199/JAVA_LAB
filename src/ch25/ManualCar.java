package ch25;

public class ManualCar extends Car{
    @Override
    public void washCar() {
        System.out.println("사람이 세차를 합니다");
    }

    @Override
    public void fuel() {
        System.out.println("사람이 기름을 넣습니다.");
    }

    @Override
    public void drive() {
        System.out.println("사람이 운전합니다.");
        System.out.println("사람이 핸들을 조작합니다.");
    }

    @Override
    public void stop() {
        System.out.println("브레이크를 밣아서 정지합니다.");
    }
}
