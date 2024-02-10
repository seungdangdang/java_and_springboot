package chapter2.ch18;

public class CarFactory {

    private static CarFactory instance = new CarFactory();
    private CarFactory() {}

    public static CarFactory getInstance() {
        if (instance == null) {
            return new CarFactory();
        }
        return instance;
    }

    public Car createCar() {
        return new Car();
    }
}
