package part3.adapter;

public class SocketAdapter implements Electronic110V{

    private Electronic220V electronic220V;

    public SocketAdapter(Electronic220V electronic220V) {
        this.electronic220V = electronic220V;
    }

    public void powerOn() {
        electronic220V.connect();
    }
}
