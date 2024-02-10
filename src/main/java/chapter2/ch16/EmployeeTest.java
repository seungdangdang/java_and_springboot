package chapter2.ch16;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employeeHong = new Employee();
        employeeHong.setEmployeeName("홍길동");
        System.out.println(employeeHong.getEmployeeId());
        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김이박");
        System.out.println(employeeKim.getEmployeeId());
    }
}
