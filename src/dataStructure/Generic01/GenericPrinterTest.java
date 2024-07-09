package dataStructure.Generic01;

public class GenericPrinterTest {
    public static void main(String[] args) {

        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>(); // <Powder> 생략가능

        powderPrinter.setMaterial(new Powder());
        System.out.println(powderPrinter);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>(); // <Powder> 생략가능
        plasticPrinter.setMaterial(new Plastic());
        System.out.println(plasticPrinter);

        GenericPrinter<Water> waterPrinter = new GenericPrinter<>();
        waterPrinter.setMaterial(new Water());
        System.out.println(waterPrinter);
    }
}
