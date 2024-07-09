package ch26;

public interface Calc {
    // 인터페이스는 상수와 추상 메서드가 선언될 수 있다,,,
    double PI = 3.14;
    int Error = -9999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);
}
