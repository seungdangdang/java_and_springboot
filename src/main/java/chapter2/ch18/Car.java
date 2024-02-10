package chapter2.ch18;

public class Car {

    private static int carNum = 10000;
    private int carNumber;

    public Car() {
        carNum++;
        carNumber = carNum;
    }

    public int getCarNum() {
        return carNumber;
    }
}
