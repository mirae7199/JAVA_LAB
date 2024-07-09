package ch14;

public class Student {
    private static int seriaNum = 1000;
    private int studentID;
    private String studentName;
    private int grade;
    private String address;

    public Student(String studentName) {
        seriaNum += 100;
        this.studentID = seriaNum;
        this.studentName = studentName;
    }

    public static int getSeriaNum() {
        return seriaNum;
    }

    public static void setSeriaNum(int seriaNum) {
        Student.seriaNum = seriaNum;
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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
