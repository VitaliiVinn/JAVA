package oop.basic.tv;

public class MainPhone {
    public static void main(String[] args) {
        Phone huawei = new Phone();
        huawei.onOffCellphone();
        huawei.charge(83);
        huawei.putMoney(0);
        huawei.call("+380675161562", 20);
        huawei.putMoney(25);
        huawei.call("+380647523658", 90);
        huawei.onOffCellphone();
    }
}
