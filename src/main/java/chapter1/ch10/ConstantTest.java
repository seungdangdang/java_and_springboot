package chapter1.ch10;

public class ConstantTest {

    public static void main(String[] args) {

        final int MAX_NUM = 100;
        final int MIN_NUM;

//        MAX_NUM = 20; -> ERROR

        System.out.println(MAX_NUM);
//        System.out.println(MIN_NUM); -> ERROR
    }
}
