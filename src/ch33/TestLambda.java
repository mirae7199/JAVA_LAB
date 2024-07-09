package ch33;

@FunctionalInterface
interface PrintString{
    void showString(String str);
}
public class TestLambda {
    public static void main(String[] args) {
        PrintString printString = str -> System.out.println("str = " + str);
        printString.showString("hello");

        // 객체 생성 하지 않음 ( 정적 메서드 사용 )
        showMyString(printString);

        PrintString myString = returnString();
        myString.showString("hello3");

    }

    // PrintString 객체가 생성되지 않았기 때문에 정적 메서드이다,,,
    public static void showMyString(PrintString str) {
        str.showString("hello2");
    }

    // 인터페이스 PrintString이 리턴값으로 람다생성 후 리턴
    public static PrintString returnString() {
        return s -> System.out.println(s + " , world");
    }

}
