package chapter2.ch11;

public class MakeReportTest {

    public static void main(String[] args) {
        MakeReport builder = new MakeReport();
        String answer = builder.getReport();
        System.out.println(answer);
    }
}
