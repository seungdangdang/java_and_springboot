package part3.adapter;

public class HairDryer implements Electronic110V{

    public void powerOn() {
        System.out.println("헤어드라이어 110v ON");
    }
}
