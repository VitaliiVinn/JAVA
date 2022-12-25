package oop.basic.tv;

public class MainWaterMachine {
    public static void main(String[] args) {
        WaterMachine kpl = new WaterMachine();
        kpl.putMoney(1, 0.05, 0.15);
        System.out.println();
        kpl.putMoney(5, 5, 15);
        System.out.println();
        kpl.putMoney(3, 0.05, 0.15);
        System.out.println();
        kpl.takeMoneyFromCell();


    }

}
