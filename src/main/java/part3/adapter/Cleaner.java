package part3.adapter;

public class Cleaner implements Electronic220V{

    public void connect() {
        System.out.println("청소기 220V On");
    }
}
