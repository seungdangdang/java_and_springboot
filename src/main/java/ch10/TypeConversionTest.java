package ch10;

public class TypeConversionTest {

    public static void main(String[] args) {

        byte bNum = 125;
        int iNum = bNum;

        System.out.println(iNum);

        int iNum2 = 255;
        byte bNum2 = (byte)iNum2;

        System.out.println(bNum2);

        double dNum = 3.14;
        int iNum3 = (int)dNum;

        System.out.println(iNum3);

        double dNum2 = 1.2;
        float fNum = 0.9F;

        int iNum4 = (int)dNum2 + (int)fNum;
        int iNum5 = (int)(dNum2 + fNum);

        System.out.println(iNum4);
        System.out.println(iNum5);
    }
}
