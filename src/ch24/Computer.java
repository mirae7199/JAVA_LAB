package ch24;

public abstract class Computer {
    public abstract void typing(); // 하위 클래스에게 구현을 위임한다
    public abstract void display(); // 하위 클래스는 반드시 구현을 해야한다

    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }

    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }
}
