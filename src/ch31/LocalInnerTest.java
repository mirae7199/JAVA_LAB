package ch31;

class Outer {
    int outNum = 100;
    static int sNum = 200;

    // Runnable 인터페이스는 스레드를 생성할 때 사용
    Runnable getRunnable(int i) {
        int localNum = 10;

        class MyRuunable implements Runnable {

            int localClassNum = 5;

            @Override
            public void run() {

                //i = 100;
                //localNum = 50;

                System.out.println("i =" + i);
                System.out.println("localClassNum = " + localClassNum);

                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
                System.out.println("Outer.sNum = " + Outer.sNum + "(외부 클래스 정적 변수)");

            }
        }
        return new MyRuunable();
    }
}
public class LocalInnerTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Runnable runnable = outer.getRunnable(100);

        runnable.run();
    }
}
