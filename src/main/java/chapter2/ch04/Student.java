package chapter2.ch04;

public class Student {

    public String studentName;
    public int studentId;
    public String studentAddress;

    public void showStudentInfo() {
        System.out.println(studentName + "의 학번은 " + studentId + "이고, 사는 곳은 " + studentAddress + "이다.");
    }
}
