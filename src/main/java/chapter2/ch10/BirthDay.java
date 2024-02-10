package chapter2.ch10;

public class BirthDay {

    private int year;
    private int month;
    private int day;
    private boolean isValid;

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            isValid = false;
        } else {
            isValid = true;
            this.month = month;
        }
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void showDate() {
        if (isValid) {
            System.out.println(year + "년 " + month + "월 " + day + "일");
        } else {
            System.out.println("유효하지 않은 날짜입니다.");
        }
    }
}
