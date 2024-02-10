package chapter2.ch04;

public class StudentTest {

    public static void main(String[] args) {

        Student studentHong = new Student();
        studentHong.studentName = "홍길동";
        studentHong.studentId = 1;
        studentHong.studentAddress = "서울시 강남구";

        studentHong.showStudentInfo();
    }
}
