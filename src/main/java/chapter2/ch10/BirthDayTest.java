package chapter2.ch10;

public class BirthDayTest {

    public static void main(String[] args) {
        BirthDay birthDay = new BirthDay();

        birthDay.setYear(2024);
        birthDay.setMonth(13);
        birthDay.setDay(30);

        birthDay.showDate();

        birthDay.setMonth(12);
        birthDay.showDate();
    }
}
