package reference;

public class SubjectTest {
    public static void main(String[] args) {
        Student2 studentKim = new Student2();
        studentKim.korean.SubjectName = "국어";
        studentKim.korean.scorePoint = 100;

        studentKim.math.SubjectName = "수학";
        studentKim.math.scorePoint = 95;
    }
}
