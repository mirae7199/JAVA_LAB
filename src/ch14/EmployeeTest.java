package ch14;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");

        //serialNum(static 변수)를 사용 할 때 클래스 이름으로 사용!!!
        //System.out.println(Employee.serialNum);

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김춘추");
        //employeeKim.serialNum++;


        //System.out.println(employeeLee.serialNum);
        //System.out.println(employeeKim.serialNum);

        System.out.println(employeeLee.getEmployeeId());
        System.out.println(employeeKim.getEmployeeId());
        System.out.println(Employee.getSerialNum());
    }
}
