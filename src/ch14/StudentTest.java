package ch14;

public class StudentTest {
    public static void main(String[] args) {
        Student studentKim = new Student("김미래");
        System.out.println(studentKim.getStudentID());

        Student studentCha = new Student("차은호");
        System.out.println(studentCha.getStudentID());


    }
}
