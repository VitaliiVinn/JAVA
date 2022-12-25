package oop.basic.tv;

public class Phone {
    private int actualBalance;
    private int charging;
    private boolean connectChargingDevice;
    private int replenishmentSum;
    private boolean turnOn;

    public void onOffCellphone() {
        if (turnOn == false) {
            turnOn = true;
            System.out.println("Telephone switched on");
        }
        else {
            turnOn = false;
            System.out.println("Cellphone is turning off");
        }
    }

    public void charge(int chargingStatus) {
        if (connectChargingDevice == false && charging < 100) {
            connectChargingDevice = true;
            while (chargingStatus < 100){
                chargingStatus++ ;
                System.out.println("Charging " + chargingStatus + " %");
            }
        }
        else if (connectChargingDevice == false && charging == 100){
            connectChargingDevice = false;
            System.out.println("Cellphone is fully charged");
        }
    }

    public void putMoney(int money){
        if(turnOn == true){
            actualBalance += money;
            System.out.println("You have balance " + actualBalance + " UAH");
        }
    }

    public void call(String callNumber, int durationOfCalling){
        if(turnOn == true && actualBalance > 0){
            System.out.println("Enter phone number and call for " + callNumber);
            System.out.println("Duration of calling is " + durationOfCalling);
        }
        else if (turnOn == true && actualBalance <= 0){
            System.out.println("Replenish your account");
        }
    }


}
