package cooperation;

public class TakeTrans {
    public static void main(String[] args) {
        Student studentKim = new Student("김미래", 10000);
        Student studentLee = new Student("이종우", 15000);

        Bus bus32 = new Bus(32);
        studentKim.takeBus(bus32);
        studentKim.showInfo();
        bus32.showInfo();

        Subway subwayGreen = new Subway("Green");
        studentLee.takeSubway(subwayGreen);
        studentLee.showInfo();
        subwayGreen.showSubwayInfo();
    }
}
