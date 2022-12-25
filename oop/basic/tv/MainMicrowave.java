package oop.basic.tv;

public class MainMicrowave {
    public static void main(String[] args) {
        Microwave vaz = new Microwave(1000, 10800, 200);
        vaz.onOff();
        vaz.changeMode(3);
        vaz.setTime(1, 55);
        vaz.setPower(500);
        vaz.start();
        vaz.onOff();

    }
}
