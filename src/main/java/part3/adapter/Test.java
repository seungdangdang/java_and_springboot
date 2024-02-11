package part3.adapter;

public class Test {

    public static void main(String[] args) {

        HairDryer hairDryer = new HairDryer();
        concept(hairDryer);

        Cleaner cleaner = new Cleaner();
        Electronic110V adapter = new SocketAdapter(cleaner);
        concept(adapter);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdapter = new SocketAdapter(airConditioner);
        concept(airAdapter);
    }

    public static void concept(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }
}
