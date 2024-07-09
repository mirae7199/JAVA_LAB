package ch28;

public interface Calc {
    // 인터페이스는 상수와 추상 메서드가 선언될 수 있다,,,
    double PI = 3.14;
    int Error = -9999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    default void description() {
        myMethod();
        System.out.println("정수를 계산합니다.");
    }

    private void myMethod() { // default 메서드에서 호출
        System.out.println("private method");
    }

    static int total(int[] arr) {

        mystaticMethod();
        int total = 0;

        for(int i=0; i<arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    private static void mystaticMethod() { // static 메서드에서 호출
        System.out.println("private static method");
    }

}
