package ch28;

public class CalculatorTest {
    public static void main(String[] args) {
        Calc calc = new CompleteCalc();
        CompleteCalc calc2 = new CompleteCalc();
        Calculator calc3 = new CompleteCalc();



        int num1 = 10;
        int num2 = 2;

        System.out.println(num1 + "+" + num2 + "=" + calc.add(num1, num2));
        System.out.println(num1 + "-" + num2 + "=" + calc.substract(num1, num2));
        System.out.println(num1 + "*" + num2 + "=" + calc.times(num1, num2));
        System.out.println(num1 + "/" + num2 + "=" + calc.divide(num1, num2));

        //calc.showInfo();
        calc.description();
        //calc2.description();
        //calc2.showInfo();
        //calc3.description();


        int[] arr = {1, 2, 3, 4, 5};

         // 인터페이스에 있는 static 함수는 인터페이스 타입으로 호출
        int total = Calc.total(arr);

        System.out.println(total);


    }
}
