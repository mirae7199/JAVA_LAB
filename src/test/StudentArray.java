package test;

public class StudentArray {
    public static void main(String[] args) {
        Student studentArray[] = new Student[3];
        studentArray[0] = new Student("James");
        studentArray[1] = new Student("Tomas");
        studentArray[2] = new Student("Edward");

        for(int i = 0; i<studentArray.length; i++) {
            studentArray[i].showStudentInfo();
        }
    }
}
