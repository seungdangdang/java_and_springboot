package chapter2.ch24;

import chapter2.ch24.Subject;
import java.util.ArrayList;

public class Student {

    int studentId;
    String studentName;
    ArrayList<Subject> subjectList;

    Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

        subjectList = new ArrayList<>();
    }

    public void addSubject(String name, int point) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScorePoint(point);

        subjectList.add(subject);
    }

    public void showTotalScore() {
        int total = 0;

        for(Subject subject : subjectList) {
            total += subject.getScorePoint();
        }
        System.out.println(studentName + "의 총점은 " + total + "점입니다.");
    }
}
