package ch06;

public class VariableTest {
    public static void main(String[] args) {

        byte bnum = -128;
        System.out.println(bnum);
        byte bnum2 = 127;
        System.out.println(bnum2);

//        int num = 12345678900; -> ERROR
//        long num = 12345678900; -> ERROR
        long num = 12345678900L;
        System.out.println(num);
    }
}
