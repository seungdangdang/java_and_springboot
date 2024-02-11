package part3.singleton;

public class SocketClient {

    private static SocketClient socketClient = null;

    // default 생성자를 private로
    private SocketClient() {}

    public static SocketClient getInstance() {

        if(socketClient == null) {
            socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect() {
        System.out.println("connect");
    }
}
