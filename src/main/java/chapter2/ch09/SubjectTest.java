package chapter2.ch09;

public class SubjectTest {

    public static void main(String[] args) {
        Student studentHong = new Student(1, "홍길동");
        studentHong.setKoreaSubject("국어", 100);
        studentHong.setMathSubject("수학", 50);

        studentHong.showTotalScore();
    }
}
