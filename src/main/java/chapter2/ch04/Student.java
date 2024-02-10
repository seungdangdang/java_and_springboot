package chapter2.ch04;

public class Student {

    public int studentId;
    public String studentName;
    public String studentAddress;

    public Student(int studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }
    public void showStudentInfo() {
        System.out.println(studentName + "의 학번은 " + studentId + "이고, 사는 곳은 " + studentAddress + "이다.");
    }
}
