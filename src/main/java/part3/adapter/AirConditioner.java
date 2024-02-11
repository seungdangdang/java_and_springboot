package part3.adapter;

public class AirConditioner implements Electronic220V {

    public void connect() {
        System.out.println("에어컨 220V On");
    }
}
