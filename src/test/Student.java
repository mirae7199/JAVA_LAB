package test;

public class Student {

    private static int number = 1000;
    private int studentID;
    private String studentName;

    public Student(String studentName) {
        this.studentName = studentName;
        this.studentID = ++number;
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        Student.number = number;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void showStudentInfo() {
        System.out.println(studentID + ", " + studentName);
    }
}
