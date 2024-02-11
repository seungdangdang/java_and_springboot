package chapter6.ch09;

public abstract class Computer {

    public abstract void display();
    public abstract void typing();

    void turnOn() {
        System.out.println("전원을 켠다.");
    }

    void turnOff() {
        System.out.println("전원을 끈다.");
    }
}
