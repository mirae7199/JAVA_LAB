package dataStructure.Generic02;



public class GenericPrinterTest {
    public static void main(String[] args) {

        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(new Powder());
        System.out.println(powderPrinter);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.setMaterial(new Plastic());
        System.out.println(plasticPrinter);


        // 상속 받지 못한 클래스는 못 쓴다.
//        GenericPrinter<Water> waterPrinter = new GenericPrinter<>();
//        waterPrinter.setMaterial(new Water());
//        System.out.println(waterPrinter);
    }
}
