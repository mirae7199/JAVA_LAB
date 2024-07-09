package ch16;

public class PersonTest {
    public static void main(String[] args) {
        Person personKim = new Person("김 씨", 100000);
        Person personLee = new Person("이 씨", 150000);

        StarCafe star = new StarCafe();
        BinCafe bin = new BinCafe();

        star.name = "별다방";
        bin.name = "콩다방";

        personKim.buyStar(star);
        personLee.buyBin(bin);

        personKim.PersonInfo();
        personLee.PersonInfo();

        star.StarCafeInfo();
        bin.BinCafeInfo();
    }
}
